package com.roberto.coldDrinkModels;

import com.roberto.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public double getPrice() {
        return 4.95;
    }

    @Override
    public String getName() {
        return "Coke";
    }
}
