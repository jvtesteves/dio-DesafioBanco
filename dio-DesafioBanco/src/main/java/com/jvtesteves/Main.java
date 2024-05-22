package com.jvtesteves;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Criando clientes
        Client client1 = new Client("Alice", "001");
        Client client2 = new Client("Bob", "002");

        // Adicionando clientes ao banco
        bank.addClient(client1);
        bank.addClient(client2);

        // Criando contas para os clientes
        Account account1 = new SavingsAccount("1001", client1);
        Account account2 = new CheckingAccount("1002", client1);
        Account account3 = new SavingsAccount("1003", client2);
        Account account4 = new CheckingAccount("1004", client2);

        // Adicionando contas ao banco
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);

        // Adicionando contas aos clientes
        client1.addAccount(account1);
        client1.addAccount(account2);
        client2.addAccount(account3);
        client2.addAccount(account4);

        // Testando depósitos
        account1.deposit(500.0);
        account2.deposit(1000.0);
        account3.deposit(1500.0);
        account4.deposit(2000.0);

        // Testando transferências
        bank.transfer(account2, account3, 200.0);

        // Testando saques
        account4.withdraw(500.0);

        // Imprimindo extratos
        System.out.println("Extrato da conta 1001:");
        account1.printStatement();
        System.out.println("Extrato da conta 1002:");
        account2.printStatement();
        System.out.println("Extrato da conta 1003:");
        account3.printStatement();
        System.out.println("Extrato da conta 1004:");
        account4.printStatement();
    }
}

