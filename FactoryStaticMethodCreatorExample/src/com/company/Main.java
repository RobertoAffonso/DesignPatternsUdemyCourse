package com.company;

public class Main {

    public static void main(String[] args) {

        /**
         * Calls the static getShape method, within the ShapeFactory class,
         * passing 'CIRCLE' as a parameter, returning a new Circle object.
         */
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        /**
         * Calls the static getShape method, within the ShapeFactory class,
         * passing 'SQUARE' as a parameter, returning a new Square object.
         */
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();

        /**
         * Calls the static getShape method, within the ShapeFactory class,
         * passing 'RECTANGLE' as a parameter, returning a new Rectangle object.
         */
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
