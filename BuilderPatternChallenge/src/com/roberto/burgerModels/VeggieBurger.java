package com.roberto.burgerModels;

import com.roberto.Burger;

public class VeggieBurger extends Burger {
    @Override
    public double getPrice() {
        return 25.0;
    }

    @Override
    public String getName() {
        return "Veggie Burger";
    }
}
