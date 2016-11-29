package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String enter;
        do {
            System.out.println("Would you like to make an order? Press Y for \"yes\" or N for \"no\".");
            Scanner scan = new Scanner(System.in);
            enter = scan.next();
            if (enter.equalsIgnoreCase("y")) {
                System.out.println(" How many flowers would you like to have in your buquet?");
                int buqueteSize = scan.nextInt();
                Order order1 = new Order(buqueteSize);

                System.out.println("HERE ARE ALL THE FLOWERS IN OUR SHOP!");
                order1.setMenu();
                System.out.println();

                System.out.println("PLEASE, MAKE YOUR CHOICE. For each flower you want press it's number from the list.");
                while (buqueteSize > 0) {
                    int chooseFlower = scan.nextInt();
                    order1.getOrder(chooseFlower);
                    buqueteSize--;
                }
                System.out.println();
                order1.yourBuquetInfo();

                System.out.println();
                order1.culcCost();
            } else{
                System.out.println("Hope to see you next time, Have a nice day!");
            }
        } while (enter.equalsIgnoreCase("y"));
    }
}
