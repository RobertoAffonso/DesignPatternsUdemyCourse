package com.company;

public class Tiger implements Animal {

    @Override
    public void Talk() {
        System.out.println("Halum-Halum");
    }

    @Override
    public void Eat() {
        System.out.println("Chomp-Chomp");
    }

    @Override
    public void Walk() {
        System.out.println("Tiger is now walking around the park.");
    }
}
