package com.bankmanagement.system.models.account;

import java.util.PropertyResourceBundle;

public abstract class Account {
    protected String accountNumber;
    protected String userId;
    protected double balance;

    public Account(String accountNumber, String userId, double balance) {
        this.accountNumber = accountNumber;
        this.userId = userId;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getUserId() {
        return userId;
    }
    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
}
