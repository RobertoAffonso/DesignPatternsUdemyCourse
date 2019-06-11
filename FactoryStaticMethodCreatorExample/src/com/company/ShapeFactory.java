package com.company;

public class ShapeFactory {

    /**
     * Implementation of the Static Factory Method,
     * this method returns a new instance of a Shape object.
     * @param shapeType
     * @return Shape
     */
    public static Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        else if(shapeType == "SQUARE"){
            return new Square();
        }
        else if(shapeType == "CIRCLE"){
            return new Circle();
        }
        else if(shapeType == "RECTANGLE"){
            return new Rectangle();
        }
        return null;
    }
}
