package com.jvtesteves;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String id;
    private List<Account> accounts;

    public Client(String name, String id) {
        this.name = name;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    // Getters e Setters
}
