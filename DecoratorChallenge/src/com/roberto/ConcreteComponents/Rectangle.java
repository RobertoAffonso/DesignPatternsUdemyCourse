package com.roberto.ConcreteComponents;

import com.roberto.ComponentInterface.Shape;

public class Rectangle implements Shape {

    /**
     * Draw method, only prints out a simple String.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}
