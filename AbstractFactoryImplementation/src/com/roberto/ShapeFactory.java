package com.roberto;

import com.roberto.interfaces.Color;
import com.roberto.interfaces.Shape;
import com.roberto.shapeModels.Circle;
import com.roberto.shapeModels.Rectangle;
import com.roberto.shapeModels.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("Square")){
            return new Square();
        }
        else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else {
            return null;
        }
    }
}
