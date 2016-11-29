package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.info;

/**
 * Created by liza on 27/10/2016.
 */
public class Order {

    int buquetSize;
    List<Flower> yourBuquet = new ArrayList<Flower>(buquetSize);

    Rose redRose;
    Rose yellowRoze;
    Rose whiteRose;

    Tulip redTulip;
    Tulip yellowTulip;

    Orchid whiteOrchid;
    Orchid pinkOrchid;

    public Order(int buquetSize) {
        this.buquetSize = buquetSize;
    }

    public void setMenu() {

        redRose = new Rose(65, "red", 10, "Rose");
        yellowRoze = new Rose(70, "yellow", 15, "Rose");
        whiteRose = new Rose(65, "white", 12, "Rose");

        redTulip = new Tulip(25, "red", 5, "Tulip");
        yellowTulip = new Tulip(25, "yellow", 5, "Tulip");

        whiteOrchid = new Orchid(45, "white", 20, "Orchid");
        pinkOrchid = new Orchid(45, "pink", 20, "Orchid");

        List<Flower> allFlower = new ArrayList<Flower>();
        allFlower.add(redRose);
        allFlower.add(yellowRoze);
        allFlower.add(whiteRose);
        allFlower.add(redTulip);
        allFlower.add(yellowTulip);
        allFlower.add(whiteOrchid);
        allFlower.add(pinkOrchid);

        int temp = 1;
        for (Flower i : allFlower) {
            System.out.print((temp++) + ")");
            i.info();
        }

    }

    public void getOrder(int chooseFlower) {

        switch (chooseFlower) {
            case 1:
                yourBuquet.add(redRose);
                System.out.println("You have just added a red Rose to your buquet");
                break;
            case 2:
                yourBuquet.add(yellowRoze);
                System.out.println("You have just added a yellow Rose to your buquet");
                break;
            case 3:
                yourBuquet.add(whiteRose);
                System.out.println("You have just added a white Rose to your buquet");
                break;
            case 4:
                yourBuquet.add(redTulip);
                System.out.println("You have just added a red Tulip to your buquet");
                break;
            case 5:
                yourBuquet.add(yellowTulip);
                System.out.println("You have just added a yellow Tulip to your buquet");
                break;
            case 6:
                yourBuquet.add(whiteOrchid);
                System.out.println("You have just added a white Orchid to your buquet");
                break;
            case 7:
                yourBuquet.add(pinkOrchid);
                System.out.println("You have just added a pink Orchid to your buquet");
                break;
        }


    }

    public void yourBuquetInfo() {
        System.out.println("In your buquet there are:");
        for (Flower i : yourBuquet) {
            System.out.println(i.getColor() + " " + i.getName());
        }
    }

    public void culcCost() {
        double cost = 0;

        for (Flower i : yourBuquet) {
            cost += i.getCost();
        }
        System.out.println("The price of your buquet is: " + cost + "$");
    }

}
