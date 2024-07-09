package com.capstone.capstone_project;

import com.capstone.capstone_project.constants.TradeAccountType;
import com.capstone.capstone_project.constants.Transaction;
import com.capstone.capstone_project.pojo.CashAccount;
import com.capstone.capstone_project.pojo.MarginAccount;
import com.capstone.capstone_project.pojo.TradeAccount;
import com.capstone.capstone_project.repository.TradeAccountRepository;
import com.capstone.capstone_project.service.CashAccountService;
import com.capstone.capstone_project.service.MarginAccountService;
import com.capstone.capstone_project.service.TradeAccountService;
import com.module2.interface_module.final_project.constants.AccountType;
import com.module2.interface_module.final_project.service.AccountService;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    static Path[] paths = new Path[] {Paths.get("src/com/capstone/capstone_project/data/accounts.txt"), Paths.get("src/com/capstone/capstone_project/data/transactions.txt")};

    static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
    static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
    static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);

    public static void loadTradeAccounts() throws IOException {
        Files.lines(paths[0]).forEach(line -> {
            String[] words = line.split(" ");
            if(words[0].equals(TradeAccountType.CASH.toString())) {
                cashAccountService.createTradeAccount(new CashAccount(words[1], new BigDecimal(words[2])));
            } else {
                marginAccountService.createTradeAccount(new MarginAccount(words[1], new BigDecimal(words[2])));
            }
        });
    }

    public static void applyTransactions() throws IOException {
        Files.lines(paths[1]).forEach(line -> {
            String[] words = line.split(" ");
            boolean isChecking = words[0].equals(TradeAccountType.CASH.toString());
            TradeAccountService tradeAccount = isChecking ?  cashAccountService : marginAccountService;
            Transaction transaction = Transaction.valueOf(words[2]);
            if(transaction.equals(Transaction.DEPOSIT)) {
                tradeAccount.deposit(words[1], new BigDecimal(words[3]));
            } else {
                tradeAccount.withdraw(words[1], new BigDecimal(words[3]));
            }
        });
    }

    public static void finalTest() throws IOException {
        System.out.println("Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
        System.out.println("Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
        System.out.println("Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
        System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
        System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
    }

    public static void main(String[] args) {
        try {
            loadTradeAccounts();
            applyTransactions();
            finalTest();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }


    }

}
