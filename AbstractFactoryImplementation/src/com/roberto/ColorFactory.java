package com.roberto;

import com.roberto.colorModels.Blue;
import com.roberto.colorModels.Green;
import com.roberto.colorModels.Red;
import com.roberto.interfaces.Color;
import com.roberto.interfaces.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if (color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        else if (color.equalsIgnoreCase("Green")){
            return new Green();
        }
        else {
            return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
