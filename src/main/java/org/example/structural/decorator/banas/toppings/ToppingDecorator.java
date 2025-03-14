package org.example.structural.decorator.banas.toppings;

import org.example.structural.decorator.banas.pizza.Pizza;

public abstract class ToppingDecorator implements Pizza {
    private final Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){
        tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
