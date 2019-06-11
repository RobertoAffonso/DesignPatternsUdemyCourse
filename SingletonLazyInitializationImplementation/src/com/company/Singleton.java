package com.company;

public class Singleton {

    // Private reference to the one and only instance.
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * This is a Singleton Constructor.
     * Note that it is private.
     * Meaning that no client can instantiate a Singleton object.
     */
    private Singleton(){
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
