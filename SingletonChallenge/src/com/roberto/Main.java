package com.roberto;

public class Main {

    public static void main(String[] args) {

        System.out.println("***Singleton Pattern Demo***");
        System.out.println("Trying to make a captain for our team");
	    Captain c1 = Captain.getInstance();
	    c1.setName("John Doe");
        System.out.println("New Captain selected for our team.");
        System.out.println(c1.getName() + " is our new Captain.");

        System.out.println("You already have a Captain for your team. Send him for the toss.");
	    Captain c2 = Captain.getInstance();
        if(c1 == c2){
            System.out.println("c1 and c2 are the same instance");
        }
    }
}
