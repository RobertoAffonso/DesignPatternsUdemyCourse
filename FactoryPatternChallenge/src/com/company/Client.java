package com.company;

public class Client {

    public static void main(String[] args) {
	    Animal tiger = AnimalFactory.getAnimal("TIGER");
	    tiger.Eat();
	    tiger.Talk();
	    tiger.Walk();

	    Animal duck = AnimalFactory.getAnimal("DUCK");
	    duck.Eat();
	    duck.Talk();
	    duck.Walk();
    }
}
