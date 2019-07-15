package com.roberto;

public class Calculator implements CalculatorInterface {

    Rectangle rectangle;

    @Override
    public double getArea(Rectangle r) {
        rectangle = r;
        return rectangle.getLength() * rectangle.getWidth();
    }
}
