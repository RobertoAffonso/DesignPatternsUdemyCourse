package com.roberto;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    Map<String, RobotInterface> robots = new HashMap<>();

    public int totalObjectsCreated(){
        return robots.size();
    }

    public RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobot = null;
        if(robots.containsKey(robotType)){
            myRobot = robots.get(robotType);
        } else {
            switch (robotType){
                case "King":
                    System.out.println("We do not have a King Robot. So we are creating a King Robot");
                    myRobot = new Robot("King");
                    robots.put("King", myRobot);
                    break;
                case "Queen":
                    System.out.println("We do not have a Queen Robot. So we are creating a Queen Robot");
                    myRobot = new Robot("Queen");
                    robots.put("Queen", myRobot);
                    break;
                default:
                    throw new Exception("Robot Factory can only create King and Queen types of robots.");
            }
        }
        return myRobot;
    }
}
