package org.example.abstract_factory.banas.ships;

import org.example.abstract_factory.banas.engine.ESEngine;
import org.example.abstract_factory.banas.weapon.ESWeapon;

public abstract class EnemyShip {
    private String name;

    // Newly defined objects that represent weapon & engine
    // These can be changed easily by assigning new parts
    // in UFOEnemyShipFactory or UFOBossEnemyShipFactory
    private ESWeapon weapon;
    private ESEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public ESWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(ESWeapon weapon) {
        this.weapon = weapon;
    }

    public ESEngine getEngine() {
        return engine;
    }

    public void setEngine(ESEngine engine) {
        this.engine = engine;
    }

    public abstract void makeShip();

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero at " + engine.getTopSpeed());
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + weapon.getDamage());
    }

    // If any EnemyShip object is printed to screen this shows up
    public String toString(){
        String infoOnShip = "The " + name + " has a top speed of " + engine.getTopSpeed() +
                " and an attack power of " + weapon.getDamage();
        return infoOnShip;
    }
}
