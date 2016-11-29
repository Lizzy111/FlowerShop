package com.company;

/**
 * Created by liza on 27/10/2016.
 */
public abstract class Flower {
    int length;
    String color;
    double cost;
    String name;


    public Flower(int sizeSm, String color, double cost, String name) {
        this.length = sizeSm;
        this.color = color;
        this.cost = cost;
        this.name= name;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

    public double getCost(){
        return cost;
    }

    public void info() {
        System.out.println("Flower " + name + " is " + color+ " color. Its length is "+ length+
                                                        "cm. The cost of one flower is "+ cost+ "$" );
    }
}
