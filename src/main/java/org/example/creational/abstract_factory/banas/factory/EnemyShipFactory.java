package org.example.creational.abstract_factory.banas.factory;

import org.example.creational.abstract_factory.banas.engine.ESEngine;
import org.example.creational.abstract_factory.banas.weapon.ESWeapon;

public interface EnemyShipFactory {
    ESWeapon addESGun();
    ESEngine addESEngine();
}
