package com.company;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank("National Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Kama",50.4);
        bank.addCustomer("Adelaide","Mika",11.1);
        bank.addCustomer("Adelaide","Percy",220.1);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.5);

        bank.addCustomerTransaction("Adelaide","Kama",44.22);
        bank.addCustomerTransaction("Adelaide","Kama",12);
        bank.addCustomerTransaction("Adelaide","Mika",41.20);

        bank.listCustomers("Adelaide",false);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 55.3)){
            System.out.println("Error, Melbourne branch does not exist");
        }

        if (!bank.addBranch("Adelaide")){
            System.out.println("Adelaide already exists");
        }
    }
}
