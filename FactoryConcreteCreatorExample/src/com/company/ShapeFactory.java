package com.company;

public class ShapeFactory {

    /**
     * This class implements the Concrete Factory Creator Pattern,
     * the most common way to implement the Factory Pattern.
     */

    // use getShape method to get an object of type shape.
    public Shape getShape(String shape){
       if(shape == null){
           return null;
       }
       else if (shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
       }
       else if (shape.equalsIgnoreCase("RECTANGLE")){
           return new Rectangle();
       }
       else if (shape.equalsIgnoreCase("SQUARE")) {
           return new Square();
       }
       return null;
    }
}
