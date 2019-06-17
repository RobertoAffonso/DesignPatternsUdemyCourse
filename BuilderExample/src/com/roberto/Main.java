package com.roberto;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        Builder carBuilder = new Car();

        Builder motorcycleBuilder = new Motorcycle();

        // Making a car.
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        // Making a motorcycle
        director.construct(motorcycleBuilder);
        Product p2 = motorcycleBuilder.getVehicle();
        p2.show();
    }
}
