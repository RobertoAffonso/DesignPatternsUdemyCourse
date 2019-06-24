package com.roberto;

import com.roberto.interfaces.Item;
import com.roberto.interfaces.Packing;
import com.roberto.packingModels.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        Packing drinkPackaging = new Bottle();
        return drinkPackaging;
    }
}
