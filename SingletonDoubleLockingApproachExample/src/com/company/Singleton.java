package com.company;

public class Singleton {

    /**
     * The volatile keyword ensures that multiple threads will handle the data correctly.
     * When it is being initialized to a single instance
     */
    private volatile static Singleton uniqueInstance = null;

    private int data = 0;

    private Singleton(){
    }

    /**
     * Singleton getInstance() method, implementing the Double Checked Locking Approach.
     * It ensures that in a multithreaded environment, there will be no performance loss
     * due to locking between two different threads.
     *
     * @return Singleton uniqueInstance
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            // Will only synchronize the first time through.
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
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
