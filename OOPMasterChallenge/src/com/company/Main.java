package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic","Sausage", 3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerADDITION1("Tomato", 0.27);
        hamburger.addHamburgerADDITION2("Lettuce", 0.75);
        hamburger.addHamburgerADDITION3("Cheese", 1.13);
        price = hamburger.itemizeHamburger();
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Bacon ", 5.67);
        healthyBurger.addHamburgerADDITION1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerADDITION3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}
