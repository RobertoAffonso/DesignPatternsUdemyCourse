package com.roberto;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck is now flying...");
    }
}

