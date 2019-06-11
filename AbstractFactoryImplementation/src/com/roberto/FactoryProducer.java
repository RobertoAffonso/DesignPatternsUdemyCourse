package com.roberto;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Color")){
            return new ColorFactory();
        }
        else if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        else {
            return null;
        }
    }
}
