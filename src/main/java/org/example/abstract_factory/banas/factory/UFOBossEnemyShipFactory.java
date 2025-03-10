package org.example.abstract_factory.banas.factory;

import org.example.abstract_factory.banas.engine.ESEngine;
import org.example.abstract_factory.banas.engine.ESUFOBossEngine;
import org.example.abstract_factory.banas.weapon.ESUFOBossGun;
import org.example.abstract_factory.banas.weapon.ESWeapon;

public class UFOBossEnemyShipFactory implements EnemyShipFactory{
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFO
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFO

    }
}
