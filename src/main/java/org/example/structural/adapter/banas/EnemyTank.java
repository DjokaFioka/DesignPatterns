package org.example.structural.adapter.banas;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank Does " + damage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank Moves " + movement + " Spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank.");
    }
}
