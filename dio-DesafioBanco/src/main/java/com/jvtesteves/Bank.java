package com.jvtesteves;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;
    private List<Account> accounts;

    public Bank() {
        this.clients = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void transfer(Account from, Account to, double amount) {
        from.transfer(to, amount);
    }

}