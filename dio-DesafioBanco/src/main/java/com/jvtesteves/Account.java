package com.jvtesteves;

public abstract class Account {
    protected String number;
    protected double balance;
    protected Client client;

    public Account(String number, Client client) {
        this.number = number;
        this.client = client;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transfer(Account to, double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            to.deposit(amount);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void printStatement() {
        System.out.println("Account Number: " + this.number);
        System.out.println("Balance: " + this.balance);
    }

    // Getters e Setters


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
