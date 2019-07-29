package com.roberto.shapeModels;

import com.roberto.AbstractShape;
import com.roberto.IColor;

public class Rectangle extends AbstractShape {

    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    protected void drawShape(int border) {
        System.out.println("This Rectangle is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    protected void modifyBorder(int border, int increment) {
        System.out.println("Now we are changing the border length " + increment + " times.");
        border = increment * border;
        drawShape(border);
    }
}
