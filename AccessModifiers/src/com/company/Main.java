package com.company;

public class Main {

    public static void main(String[] args) {
	Account account = new Account("Kama");
	account.deposit(1000);
	account.withdraw(500);
	account.withdraw(-200);
	account.deposit(-20);
	account.calculateBalance();
	//account.balance = 5000;

        System.out.println("Balance on account is " + account.getBalance());
        //account.transactions.add(4500);
        account.calculateBalance();
    }
}
