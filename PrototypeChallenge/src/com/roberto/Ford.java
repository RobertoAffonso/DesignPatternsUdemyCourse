package com.roberto;

public class Ford extends BasicCar{

    public Ford() {
        super.name = "Ford";
        super.price = 46.789;
    }

    @Override
    protected Object clone() {
        return super.clone();
    }
}
