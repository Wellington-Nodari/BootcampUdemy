package com.capstone.capstone_project.service;

import com.capstone.capstone_project.pojo.MarginAccount;
import com.capstone.capstone_project.pojo.TradeAccount;
import com.capstone.capstone_project.repository.TradeAccountRepository;

import java.math.BigDecimal;

public class MarginAccountService implements TradeAccountService{

    private TradeAccountRepository tradeAccountRepository;

    public MarginAccountService (TradeAccountRepository repository) {
        this.tradeAccountRepository = repository;
    }

    public void deposit(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) tradeAccountRepository.retrieveTradeAccount(id);
        account.setMargin(account.getMargin().add(amount));
        updateTradeAccount(account);
    }

    public void withdraw(String id, BigDecimal amount) {
        MarginAccount account = (MarginAccount) tradeAccountRepository.retrieveTradeAccount(id);
        account.setMargin(account.getMargin().subtract(amount));
        updateTradeAccount(account);
    }

    public void createTradeAccount(TradeAccount account) {
        this.tradeAccountRepository.createTradeAccount(account);
    }

    public MarginAccount retrieveTradeAccount(String id) {
        return (MarginAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(TradeAccount account) {
        this.tradeAccountRepository.updateTradeAccount(account);
    }

    public void deleteTradeAccount(String id) {
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

}
