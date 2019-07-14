package com.roberto;

import java.util.Hashtable;

public class BasicCarCache {

    static {
        basicCarTable = new Hashtable<>();
        createCache();
    }

    private static Hashtable<String, BasicCar> basicCarTable;

    public static BasicCar getBasicCar(String basicCarId){
        BasicCar basicCar = basicCarTable.get(basicCarId);
        return (BasicCar) basicCar.clone();
    }

    public static void createCache(){
        Ford ford = new Ford();
        basicCarTable.put(ford.getName(), ford);

        Nano nano = new Nano();
        basicCarTable.put(nano.getName(), nano);
    }
}
