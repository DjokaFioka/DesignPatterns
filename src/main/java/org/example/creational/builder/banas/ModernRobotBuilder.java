package org.example.creational.builder.banas;

public class ModernRobotBuilder implements RobotBuilder {
    private Robot robot;

    public ModernRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Carbon fiber Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Aluminium Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Iron Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Jet Engines");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
