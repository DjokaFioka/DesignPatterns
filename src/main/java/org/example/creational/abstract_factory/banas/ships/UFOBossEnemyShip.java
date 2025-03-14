package org.example.creational.abstract_factory.banas.ships;

import org.example.creational.abstract_factory.banas.factory.EnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip{
    // We define the type of ship we want to create
    // by stating we want to use the factory that
    // makes enemy ships
    EnemyShipFactory shipFactory;

    // The enemy ship required parts list is sent to
    // this method. They state that the enemy ship
    // must have a weapon and engine assigned. That
    // object also states the specific parts needed
    // to make a Boss UFO versus a Regular UFO
    public UFOBossEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    // EnemyShipBuilding calls this method to build a
    // specific UFOBossEnemyShip
    @Override
    public void makeShip() {
        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOBossEnemyShip here
        setWeapon(shipFactory.addESGun());
        setEngine(shipFactory.addESEngine());
    }

}
