package com.roberto;

public class Robot implements RobotInterface {

    private String robotType;
    public String robotColor;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + "  type robot with " + robotColor + " color");
    }

    @Override
    public void setColor(String robotColor) {
        this.robotColor = robotColor;
    }
}
