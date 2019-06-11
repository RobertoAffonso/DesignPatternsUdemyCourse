package com.company;

public class Duck implements Animal {

    @Override
    public void Talk() {
        System.out.println("Pack-Pack");
    }

    @Override
    public void Eat() {
        System.out.println("Tack-Tack");
    }

    @Override
    public void Walk() {
        System.out.println("Duck is now floating around the lake.");
    }
}
