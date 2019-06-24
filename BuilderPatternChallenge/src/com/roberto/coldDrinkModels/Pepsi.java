package com.roberto.coldDrinkModels;

import com.roberto.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getName() {
        return "Pepsi";
    }
}
