package com.capstone.capstone_project.service;

import com.capstone.capstone_project.pojo.CashAccount;
import com.capstone.capstone_project.pojo.TradeAccount;
import com.capstone.capstone_project.repository.TradeAccountRepository;

import java.math.BigDecimal;

public class CashAccountService implements TradeAccountService{

    private TradeAccountRepository tradeAccountRepository;

    public CashAccountService (TradeAccountRepository repository) {
        this.tradeAccountRepository = repository;
    }

    public void deposit(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) tradeAccountRepository.retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().add(amount));
        updateTradeAccount(account);
    }

    public void withdraw(String id, BigDecimal amount) {
        CashAccount account = (CashAccount) tradeAccountRepository.retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().subtract(amount));
        updateTradeAccount(account);
    }

    public void createTradeAccount(TradeAccount account) {
        this.tradeAccountRepository.createTradeAccount(account);
    }

    public CashAccount retrieveTradeAccount(String id) {
        return (CashAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(TradeAccount account) {
        this.tradeAccountRepository.updateTradeAccount(account);
    }

    public void deleteTradeAccount(String id) {
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

}
