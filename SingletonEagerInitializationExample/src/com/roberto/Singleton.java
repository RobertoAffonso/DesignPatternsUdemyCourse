package com.roberto;

public class Singleton {

    /**
     * Creates an instance of Singleton in a static initializer, guaranteeing that the code
     * will be thread safe.
     */
    private static Singleton uniqueInstance = new Singleton();

    private int data;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // Since an instance already exists, this method just returns it.
        return uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
