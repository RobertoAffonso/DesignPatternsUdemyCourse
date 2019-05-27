package com.roberto;

public class Main {

    /**
     * Most strict implementation of the Factory Pattern, the Abstract Creator Factory
     * Requires you to create an abstract class of the factory pattern including an
     * abstract method which returns the desired object. This implementation requires
     * the programmer to subclass each object creator.
     * For example: SquareFactory extends AbstractShapeFactory.
     */

    public static void main(String[] args) {

        // Gets an object of type circle.
        Shape circle = new CircleFactory().getShape();
        // Calls the draw method inside the Circle object.
        circle.draw();

        // Gets an object of type Square.
        Shape square = new SquareFactory().getShape();
        // Calls the draw method inside the Square object.
        square.draw();

        // Gets an object of type Rectangle.
        Shape rectangle = new RectangleFactory().getShape();
        // Calls the draw method inside the Rectangle object.
        rectangle.draw();
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
