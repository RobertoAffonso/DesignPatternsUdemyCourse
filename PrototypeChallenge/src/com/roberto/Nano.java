package com.roberto;

public class Nano extends BasicCar{

    public Nano() {
        super.name = "Nano";
        super.price = 56.984;
    }

    @Override
    protected Object clone() {
        return super.clone();
    }
}
