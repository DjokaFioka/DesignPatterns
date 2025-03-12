package org.example.creational.abstract_factory.banas.factory;

import org.example.creational.abstract_factory.banas.engine.ESEngine;
import org.example.creational.abstract_factory.banas.engine.ESUFOEngine;
import org.example.creational.abstract_factory.banas.weapon.ESUFOGun;
import org.example.creational.abstract_factory.banas.weapon.ESWeapon;

public class UFOEnemyShipFactory implements EnemyShipFactory{
    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO

    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine(); // Specific to regular UFO
    }
}
