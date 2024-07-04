package com.module2.interface_module.service;

import java.math.BigDecimal;

public interface AccountService {
    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);
}
