package com.roberto;

import com.roberto.colorModels.GreenColor;
import com.roberto.colorModels.RedColor;
import com.roberto.shapeModels.Rectangle;
import com.roberto.shapeModels.Triangle;

public class Main {

    public static void main(String[] args) {
	    AbstractShape triangle = new Triangle(new RedColor());
	    triangle.drawShape(20);
	    triangle.modifyBorder(20, 3);

	    AbstractShape rectangle = new Rectangle(new GreenColor());
	    rectangle.drawShape(30);
	    rectangle.modifyBorder(30, 5);
    }
}
