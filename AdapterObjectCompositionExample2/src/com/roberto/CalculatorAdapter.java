package com.roberto;

public class CalculatorAdapter implements CalculatorInterface {

    /**
     * Adaptee object, implementing the adapter interface
     * via composition.
     */
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();

        r = new Rectangle(0, 0);

        r.setLength(triangle.getBase());
        r.setWidth(0.5 * triangle.getHeight());

        return calculator.getArea(r);
    }
}
