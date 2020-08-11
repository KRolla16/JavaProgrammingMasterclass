package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
//	Gearbox mcLean = new Gearbox(6);
//	    mcLean.operateClutch(true);
//        mcLean.changeGear(1);
//        mcLean.operateClutch(false);
//        System.out.println(mcLean.wheelSpeed(1000));
//        mcLean.changeGear(2);
//        System.out.println(mcLean.wheelSpeed(3000));
//        mcLean.operateClutch(true);
//        mcLean.changeGear(3);
//        mcLean.operateClutch(false);
//        System.out.println(mcLean.wheelSpeed(6000));

//Gearbox.Gear first = mcLean.new Gear(1, 2.13);
//Gearbox.Gear second = new Gearbox.Gear(2,15.4);cannot like that
 //   Gearbox.Gear third = new  mcLaren.Gear() cannot like that
 // System.out.println(first.driveSpeed(1000));

        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("Ive been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
