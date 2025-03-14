package org.example.creational.prototype.banas;

public class Sheep implements Animal{

    public Sheep(){
        System.out.println("Sheep is Made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is Being Made");

        Sheep sheepObject = null;
        try {
            // Calls the Animal super classes clone()
            // Then casts the results to Sheep
            sheepObject = (Sheep) super.clone();
        }
        // If Animal didn't extend Cloneable this error
        // is thrown
        catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported!");
            e.printStackTrace();
        }

        return sheepObject;
    }

    public String toString(){
        return "Dolly is my Hero, Beeeee";
    }
}
