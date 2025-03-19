package org.example.behavioral.template.banas;

public abstract class Sandwich {

    boolean afterFirstCondiment = false; //For formatting output

    final void makeSandwich() {
        cutBun();
        if (customerWantsMeat()) {
            addMeat();
            afterFirstCondiment = true;
        }

        if (customerWantsCheese()) {
            if (afterFirstCondiment)
                System.out.println();
            addCheese();
            afterFirstCondiment = true;
        }

        if (customerWantsVegetables()) {
            if (afterFirstCondiment)
                System.out.println();
            addVegetables();
            afterFirstCondiment = true;
        }
        if (customerWantsCondiments()) {
            if (afterFirstCondiment)
                System.out.println();
            addCondiments();
            afterFirstCondiment = true;
        }
        if (afterFirstCondiment)
            System.out.println();
        wrapTheSandwich();
    }

    public void cutBun() {
        System.out.println("The Sandwich Bun is Cut");
    }

    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    //Hooks
    boolean customerWantsMeat() {
        return true;
    }
    boolean customerWantsCheese() {
        return true;
    }
    boolean customerWantsVegetables() {
        return true;
    }
    boolean customerWantsCondiments() {
        return true;
    }

    public void wrapTheSandwich() {
        System.out.println("The Sandwich is wrapped and ready.");
    }
}
