package com.roberto.colorModels;

import com.roberto.IColor;

public class GreenColor implements IColor {

    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + " inch border.");
    }
}
