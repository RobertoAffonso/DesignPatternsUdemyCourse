package com.roberto;

import com.roberto.interfaces.Color;
import com.roberto.interfaces.Shape;

public class Main {

    public static void main(String[] args) {

        // gets a factory type, and stores it inside the colorFactory variable
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        // Creates a new Color object, named 'red'
        Color red = colorFactory.getColor("Red");
        // Calls the fill() method within the 'red' Color object
        red.fill();

        // Creates a new Color object, named 'green'
        Color green = colorFactory.getColor("Green");
        // Calls the fill() method within the 'blue' color object
        green.fill();

        //
        Color blue = colorFactory.getColor("Blue");
        blue.fill();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
