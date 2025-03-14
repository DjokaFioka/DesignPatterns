package org.example.structural.decorator.banas;

import org.example.structural.decorator.banas.pizza.Pizza;
import org.example.structural.decorator.banas.pizza.PlainPizza;
import org.example.structural.decorator.banas.toppings.Mozzarela;
import org.example.structural.decorator.banas.toppings.TomatoSauce;

/**
 The decorator allows you to modify an object dynamically
 You would use it when you want the capabilities of inheritance with subclasses,
 but you need to add functionality at run time
 It is more flexible than inheritance
 Simplifies code because you add functionality using many simple classes
 Rather than rewrite old code you can extend with new code
 * */
public class DecoratorMain {
    public static void main(String[] args) {
        //Pizza maker example
        Pizza basicPizza = new Mozzarela(new TomatoSauce(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Cost: " + basicPizza.getCost());
    }
}
