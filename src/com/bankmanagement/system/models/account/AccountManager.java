package com.bankmanagement.system.models.account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        if (account != null) {
            accounts.add(account);
        } else {
            System.out.println("Cannot add empty Value");
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
}
