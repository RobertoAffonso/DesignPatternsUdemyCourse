package com.roberto;

import java.util.Random;

public class Client {

    public static void main(String[] args)
    throws Exception {
	    RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***");

	    Robot type;

	    for(int i = 0; i < 3; i++){
	        type = (Robot) robotFactory.getRobotFromFactory("King");
	        type.setColor(getRandomColor());
	        type.print();
        }

        for(int i = 0; i < 3; i++){
            type = (Robot) robotFactory.getRobotFromFactory("Queen");
            type.setColor(getRandomColor());
            type.print();
        }

        int numOfDistinctObjects = robotFactory.totalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + numOfDistinctObjects);
    }

    private static String getRandomColor() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(20);
        if(randomNumber%2 == 0){
            return "red";
        } else {
            return "blue";
        }
    }
}
