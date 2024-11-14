package com.bankmanagement.system.models.account;

public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(String accountNumber, String userId, double balance, double interestRate) {
        super(accountNumber, userId, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }
}
