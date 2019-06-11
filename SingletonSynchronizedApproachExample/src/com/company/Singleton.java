package com.company;

public class Singleton {

    private static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton(){
    }

    /** By adding the Synchronized keyword to the getInstance() method
     *  we force every thread to wait its turn before it can enter
     *  the method.
     */
    public static synchronized Singleton getInstance(){
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
