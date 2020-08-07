package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerADDITION1("Chips", 2.75);
        super.addHamburgerADDITION2("Drink", 1.81);
    }


    @Override
    public void addHamburgerADDITION1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerADDITION2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerADDITION3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerADDITION4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
