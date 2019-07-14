package com.roberto;

public abstract class BasicCar implements Cloneable{

    protected String name;

    /**
     * Default vehicle price
     */
    protected double price = 25000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }
}
