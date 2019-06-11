package com.company;

public class Client {

    public static void main(String[] args) {

        /**
         * Creates a new ShapeFactory instance
         */
        ShapeFactory shapeFactory = new ShapeFactory();

        /**
         * Declares a new circle object, asking the Factory
         * to provide a new object. After that, it calls the
         * draw method.
         */
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        /**
         * Declares a new rectangle object, asking the Factory
         * pattern to get a new Rectangle object. after that
         * it calls the draw method.
         */
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        /**
         * Declares a new Square object, asking the Factory
         * pattern to get a new Square object. after that
         * it calls the draw method.
         */
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
