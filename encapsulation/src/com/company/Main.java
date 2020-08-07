package com.company;

public class Main {

    public static void main(String[] args) {
/*	player.FullName = "Jon";
	player.health = 20;
	player.weapon = "sword";

	int damage = 10;
	player.loseHealth(damage);
	System.out.println("Remaining health: " + player.healthRemaining());


	damage = 11;
    player.loseHealth(damage);
    System.out.println("Remaining health: " + player.healthRemaining());
*/


        EnhancedPlayer player = new EnhancedPlayer("Jon",50,"Sword");
        System.out.println("Basic health" + player.getHealth());


        Printer printer = new Printer(50, true);
        System.out.println("initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed:" + pagesPrinted + "new total print count for printer: " + printer.getPagesPrinted());
    }
}
