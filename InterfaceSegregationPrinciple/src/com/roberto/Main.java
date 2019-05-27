package com.roberto;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

interface ShapeInterface{
    public double area();
}

interface SolidShapeInterface {
    public double volume();
}

interface ManageShapeInterface {
    public double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements ShapeInterface, ManageShapeInterface {

    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double calculate() {
        return area();
    }
}
