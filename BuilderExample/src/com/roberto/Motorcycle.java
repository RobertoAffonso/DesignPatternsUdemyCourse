package com.roberto;

public class Motorcycle implements Builder{

    /**
     * This class represents the Concrete Builder method of the
     * Builder interface.
     */

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is the body of a Motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("These are the 2 wheels of a Motorcycle");
    }

    @Override
    public void addHeadlights() {
        product.add("This is the 1 headlight of a Motorcycle");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
