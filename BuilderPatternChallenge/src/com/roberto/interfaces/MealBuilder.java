package com.roberto.interfaces;

import com.roberto.Meal;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
