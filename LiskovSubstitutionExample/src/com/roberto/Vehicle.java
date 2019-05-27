package com.roberto;

public abstract class Vehicle {
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle {

    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    private String sHatchBack(){
        return "";
    }

}

class Bus extends Vehicle {

    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    private String getEmergencyExitLoc(){
        return "";
    }
}
