package org.example.creational.abstract_factory.banas.builders;

import org.example.creational.abstract_factory.banas.ships.EnemyShip;
import org.example.creational.abstract_factory.banas.ships.UFOBossEnemyShip;
import org.example.creational.abstract_factory.banas.ships.UFOEnemyShip;
import org.example.creational.abstract_factory.banas.factory.EnemyShipFactory;
import org.example.creational.abstract_factory.banas.factory.UFOBossEnemyShipFactory;
import org.example.creational.abstract_factory.banas.factory.UFOEnemyShipFactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding{
    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        // If UFO was sent use the factory that knows
        // what types of weapons and engines a regular UFO
        // needs. The EnemyShip object is returned & given a name
        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        } else
            // If UFO BOSS was sent use the factory that knows
            // what types of weapons and engines a Boss UFO
            // needs. The EnemyShip object is returned & given a name
            if(typeOfShip.equals("UFO BOSS")){
                EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");

            }

        return theEnemyShip;
    }
}
