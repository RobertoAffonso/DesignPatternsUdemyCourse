package com.roberto.ConcreteDecorators;

import com.roberto.AbstractDecorator.AbstractShapeDecorator;

public class RedShapeDecorator extends AbstractShapeDecorator {

    /**
     * Decorator´s new Draw method.
     */
    @Override
    public void draw() {
        super.draw();
        System.out.println("Border Color: Red");
    }
}
