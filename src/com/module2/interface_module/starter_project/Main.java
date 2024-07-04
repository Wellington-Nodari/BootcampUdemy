package com.module2.interface_module.starter_project;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.module2.interface_module.starter_project.pojo.Account;
import com.module2.interface_module.starter_project.pojo.Checking;
import com.module2.interface_module.starter_project.pojo.Credit;
import com.module2.interface_module.starter_project.repository.AccountRepository;
import com.module2.interface_module.starter_project.service.AccountService;
import com.module2.interface_module.starter_project.service.CheckingService;
import com.module2.interface_module.starter_project.service.CreditService;

public class Main {

    public static void main(String[] args) {
        AccountRepository repository = new AccountRepository();
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);

        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
                new Checking("A1234B", new BigDecimal("500.00")),
                new Checking("E3456F", new BigDecimal("300.50")),
                new Checking("I5678J", new BigDecimal("100.25")),
                new Credit("A1534B", new BigDecimal("0.50")),
                new Credit("G4567H", new BigDecimal("200.00"))
        );

        accounts.forEach(account -> {
            if (account instanceof  Checking) {
                checkingService.createAccount((Checking) account);
            } else {
                creditService.createAccount((Credit) account);
            }
        });

        Checking checking = (Checking) repository.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("100.00")));
        repository.updateAccount(checking);
        repository.deleteAccount("G4567H");

        AccountService accountService = new CheckingService(repository);
        accountService.deposit("1", new BigDecimal("100"));
        accountService.withdraw("1", new BigDecimal("50"));
    }


}
