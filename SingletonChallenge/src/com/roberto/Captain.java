package com.roberto;

public class Captain{

    private String name = null;

    private Captain(){
    }

    private static class SingletonHelper{
        private static final Captain captainInstance = new Captain();
    }

    public static Captain getInstance(){
        return SingletonHelper.captainInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
