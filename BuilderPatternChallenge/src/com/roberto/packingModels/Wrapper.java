package com.roberto.packingModels;

import com.roberto.interfaces.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }

    @Override
    public String toString() {
        return "Wrapper";
    }
}
