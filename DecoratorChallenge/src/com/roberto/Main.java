package com.roberto;

import com.roberto.ComponentInterface.Shape;
import com.roberto.ConcreteComponents.Circle;
import com.roberto.ConcreteComponents.Rectangle;
import com.roberto.ConcreteDecorators.GreenShapeDecorator;
import com.roberto.ConcreteDecorators.RedShapeDecorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Decorator Pattern Challenge***");

        Shape rectangle = new Rectangle(); // Creates a new Rectangle object.
        rectangle.draw(); // Calls the draw method.

        RedShapeDecorator redBorderDecorator = new RedShapeDecorator(); // Creates a new RedColorShape decorator
        redBorderDecorator.setShape(rectangle); // Injects the rectangle shape, into the decorator.
        redBorderDecorator.draw(); // Calls the decorator´s draw method.

        Shape circle = new Circle(); // Creates a new Circle object.
        circle.draw(); // Calls the draw method.

        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(); // Creates a new GreenShapeDecorator.
        greenShapeDecorator.setShape(circle); // Injects the circle shape into the decorator.
        greenShapeDecorator.draw(); // Calls the decorator´s draw method.


    }
}
