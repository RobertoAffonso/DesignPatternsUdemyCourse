package com.roberto;

import com.roberto.interfaces.Color;
import com.roberto.interfaces.Shape;

public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
