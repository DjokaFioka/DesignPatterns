package org.example.behavioral.template.banas;

public class VeggieSandwich extends Sandwich{
    String[] vegetablesUsed = {"Lettuce", "Totmatoes", "Onions", "Sweet Peppers"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    boolean customerWantsMeat() {
        return false;
    }

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addMeat() {
    }

    @Override
    void addCheese() {
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
