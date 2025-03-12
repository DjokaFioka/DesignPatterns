package org.example.creational.factory;

// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

public class EnemyShipFactory {

    // This could be used as a static method if we
    // are willing to give up subclassing it
    public EnemyShip makeEnemyShip(String newShipType){
        return switch (newShipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };
    }
}
