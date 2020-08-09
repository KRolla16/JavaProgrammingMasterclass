package com.company;

import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4403");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter action: (6 to show avalivle actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void queryContact() {
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " Phone: " + existingContactRecord.getPhoneNumber() );

    }

    private static void removeContact() {
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
       if (mobilePhone.removeContact(existingContactRecord)){
           System.out.println("successfully deleted");
        }else {
           System.out.println("error");
       }

    }

    private static void updateContact() {
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
       if (mobilePhone.updateContact(existingContactRecord,newContact)){
           System.out.println("Successfully updated");
       }else {
           System.out.println("Error while update");
       }
    }

    private static void addNewContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added name = " +name + " number = " + phone);
        }else {
            System.out.println("cannot add " + name + " is already used");
        }
    }

    private static void printContacts() {
        System.out.println("Contact list: ");
        mobilePhone.printContacts();

    }

    private static void printActions() {
        System.out.println("\nAvalible actions: \npress");
        System.out.println("0 - to shutdown\n" +
                "1- to print contacts\n" +
                "2- to add contact\n" +
                "3- to update contact\n" +
                "4- to remove contact\n" +
                "5- query if an existing contact exists\n" +
                "6- to print available actions");
        System.out.println("Choose action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

}
