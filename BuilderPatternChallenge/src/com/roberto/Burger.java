package com.roberto;

import com.roberto.interfaces.Item;
import com.roberto.interfaces.Packing;
import com.roberto.packingModels.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing getPacking() {
        Packing burgerPackaging = new Wrapper();
        return burgerPackaging;
    }
}
