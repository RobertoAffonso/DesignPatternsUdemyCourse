package com.roberto.packingModels;

import com.roberto.interfaces.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }

    @Override
    public String toString() {
        return "Bottle";
    }
}
