package com.bankmanagement.system.models;

import com.bankmanagement.system.models.account.Account;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;
    private List<Account> accounts;

    public User(String id, String name, String phoneNumber, String emailAddress, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.accounts = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public String getName() {return name;}
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void  addAccount(Account account) {
        if (account != null) {
            accounts.add(account);
        } else {
            System.out.println("Cannot add Null");
        }
    }
    public Account getAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User Information:\n")
                .append("| ID: ").append(id)
                .append(" | Name: ").append(name)
                .append(" | Phone: ").append(phoneNumber)
                .append(" | Email: ").append(emailAddress)
                .append(" | Address: ").append(address)
                .append("\nAccounts:\n");
        for (Account account : accounts) {
            sb.append(account.toString()).append("\n");
        }
        return sb.toString();
    }
}
