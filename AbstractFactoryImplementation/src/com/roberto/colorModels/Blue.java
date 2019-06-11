package com.roberto.colorModels;

import com.roberto.interfaces.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
