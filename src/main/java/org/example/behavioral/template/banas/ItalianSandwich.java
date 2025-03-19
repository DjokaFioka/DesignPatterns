package org.example.behavioral.template.banas;

public class ItalianSandwich extends Sandwich{

    String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
    String[] cheeseUsed = {"Provalone"};
    String[] vegetablesUsed = {"Lettuce", "Totmatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};


    @Override
    void addMeat() {
        System.out.print("Adding the meat: ");
        for (var meat : meatUsed) {
            System.out.print(meat + " ");
        }
    }

    @Override
    void addCheese() {
        System.out.print("Adding the cheese: ");
        for (var cheese : cheeseUsed) {
            System.out.print(cheese + " ");
        }
    }

    @Override
    void addVegetables() {
        System.out.print("Adding the vegetables: ");
        for (var veg : vegetablesUsed) {
            System.out.print(veg + " ");
        }
    }

    @Override
    void addCondiments() {
        System.out.print("Adding the condiments: ");
        for (var cond : condimentsUsed) {
            System.out.print(cond + " ");
        }
    }
}
