package com.bankmanagement.system.models.account;

public class SavingAccount extends Account{
    public static final double INTEREST_RATE = 0.02;
    public SavingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into Savings Account " + accountNumber);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    public void applyInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest applied to Savings Account " + accountNumber + ": $" + interest);
    }

    @Override
    public String toString() {
        return "Savings Account - Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
