package org.example.structural.adapter.banas;

/**
 Allows 2 incompatible interfaces to work together
 * */
public class AdapterMain {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapater = new EnemyRobotAdapter(robot);

        System.out.println("The Robot");
        robot.reactToHuman("Cile");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("Enemy Tank");
        tank.assignDriver("Mile");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println("The robot with adapter");
        robotAdapater.assignDriver("Zile"); //will reactToHuman
        robotAdapater.driveForward(); //will walkForward
        robotAdapater.fireWeapon(); //will smashWithHands
    }
}
