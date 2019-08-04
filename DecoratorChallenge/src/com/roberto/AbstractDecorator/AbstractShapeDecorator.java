package com.roberto.AbstractDecorator;

import com.roberto.ComponentInterface.Shape;

public abstract class AbstractShapeDecorator implements Shape {

    /**
     * Shape Component instance object.
     */
    private Shape shape;

    /**
     * Calls the shape object´s original draw() method.
     */
    @Override
    public void draw() {
        if(shape != null){
            shape.draw();
        }
    }

    /**
     * Injects the Component instance object, in order to keep
     * the original behavior.
     * @param shape
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
