package org.example.structural.adapter.banas;

import java.util.Random;
/**
 This class can't work with EnemyAttacker so we create EnemyRobotAdapter
 */
public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + damage + " Damage With Its Hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " Spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }
}
