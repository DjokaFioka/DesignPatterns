package org.example.abstract_factory.banas;

import org.example.abstract_factory.banas.builders.EnemyShipBuilding;
import org.example.abstract_factory.banas.builders.UFOEnemyShipBuilding;
import org.example.abstract_factory.banas.ships.EnemyShip;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }
}
