package com.roberto;

import com.roberto.interfaces.MealBuilder;

public class Director {
    MealBuilder mealBuilder;

    private Meal meal;

    public void construct(MealBuilder mealBuilder){
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
        this.meal = mealBuilder.getMeal();
    }

    public Meal getMeal() {
        return meal;
    }
}
