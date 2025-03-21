package org.example.creational.prototype.banas;

public class PrototypeMain {
    public static void main(String[] args) {
        // Handles routing makeCopy method calls to the
        // right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own
        // memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        var clone = animalMaker.getClone(sally);
        // These are exact copies of each other
        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println(clone);
        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Cloned sheep HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clone)));
    }
}
