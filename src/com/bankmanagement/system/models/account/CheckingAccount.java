package com.bankmanagement.system.models.account;

public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " Into Checking Account " + accountNumber);
        }
        else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance > 0) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account " + accountNumber);
        }
        else {
            System.out.println("Withdraw amount should be positive.");
        }
    }
    @Override
    public String toString() {
        return "Checking Account - Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
