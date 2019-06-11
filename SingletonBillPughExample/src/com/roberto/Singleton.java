package com.roberto;

public class Singleton {

    // an instance attribute
    private int data = 0;

    /**
     * This is a Singleton Constructor.
     * Note that it is private.
     * Meaning that no client can instantiate a Singleton object.
     */
    private Singleton(){
    }

    /**
     * This implements the Bill Pugh method, which makes use of a
     * private static inner helper class, ensuring that a new instance
     * of a singleton will only be created, if getInstance() gets called.
     */
    private static class SingletonHelper {
        // Nested class is referenced after getInstance() is called.
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
