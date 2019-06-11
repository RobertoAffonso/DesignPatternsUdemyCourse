package com.roberto.colorModels;

import com.roberto.interfaces.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
