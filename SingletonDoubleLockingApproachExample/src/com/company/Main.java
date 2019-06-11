package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(20);
        System.out.println("First Reference: " + singleton);
        System.out.println("Singleton data value is: " + singleton.getData());

        singleton = null;
        singleton = Singleton.getInstance();

        System.out.println("\nSecond Reference: " + singleton);
        System.out.println("Singleton data value is: " + singleton.getData());
    }
}
