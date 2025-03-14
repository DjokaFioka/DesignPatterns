package org.example.structural.decorator.banas.toppings;

import org.example.structural.decorator.banas.pizza.Pizza;

public class Mozzarela extends ToppingDecorator{
    public Mozzarela(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Mozzarela");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mozzarela";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
