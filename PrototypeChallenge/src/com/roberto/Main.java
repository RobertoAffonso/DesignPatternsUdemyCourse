package com.roberto;

public class Main {

    public static void main(String[] args) {
        Ford ford = (Ford) BasicCarCache.getBasicCar("Ford");
        Nano nano = (Nano) BasicCarCache.getBasicCar("Nano");

        System.out.println("*** Prototype Pattern Challenge ***");
        System.out.println();
        System.out.println("Car is: " + ford.getName() + " and it´s price is Rs." + ford.getPrice());
        System.out.println("Car is: " + nano.getName() + " and it´s price is Rs." + nano.getPrice());
    }
}
