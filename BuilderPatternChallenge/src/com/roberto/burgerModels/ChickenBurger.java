package com.roberto.burgerModels;

import com.roberto.Burger;

public class ChickenBurger extends Burger {

    @Override
    public double getPrice() {
        return 30.0;
    }

    @Override
    public String getName() {
        return "Chicken Burger";
    }
}
