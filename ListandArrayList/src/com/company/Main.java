package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	boolean quit = false;
	int choice =0;
	printInstructions();
	while (!quit){
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 0:
                printInstructions();
                break;
            case 1:
                groceryList.printGroceryList();
                break;
            case 2:
                addItem();
                break;
            case 3:
                modifyItem();
                break;
            case 4:
                removeItem();
                break;
            case 5:
                searchForItem();
                break;
            case 6:
                processArrayList();
                break;
            case 7:
                quit = true;
                break;
        }
    }
    }

    private static void processArrayList() {
        ArrayList<String > newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }


    private static void printInstructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 to see options");
        System.out.println("\t 1 to print list of items");
        System.out.println("\t 2 to add an item");
        System.out.println("\t 3 to modify an item");
        System.out.println("\t 4 to remove an item");
        System.out.println("\t 5 to search for an item");
        System.out.println("\t 6 to quit");
    }

    public static void addItem(){
        System.out.println("Please enter the item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void searchForItem() {
        System.out.println("Enter item to search: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in list");
        }else {
            System.out.println(searchItem + " not found");
        }


    }

    private static void removeItem() {
        System.out.println("Enter item number: ");
        String  itemNo = scanner.nextLine();

        groceryList.removeGroceryItem(itemNo);
    }

    private static void modifyItem() {
        System.out.println("Current item number: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo,newItem);
    }
}
