package com.roberto;

public class Car implements Builder{

    /**
     * Represents the concrete builder for the builder interface.
     */

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car.");
    }

    @Override
    public void insertWheels() {
        product.add("These are the 4 wheels of a car.");
    }

    @Override
    public void addHeadlights() {
        product.add("These are the 2 headlights of a car.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
