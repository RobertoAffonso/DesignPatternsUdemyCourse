package com.roberto.colorModels;

import com.roberto.interfaces.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
