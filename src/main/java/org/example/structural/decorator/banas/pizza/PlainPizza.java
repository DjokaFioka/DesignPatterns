package org.example.structural.decorator.banas.pizza;

public class PlainPizza implements Pizza {

    public PlainPizza() {
        System.out.println("Adding dough");
    }

    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 4.0;
    }
}
