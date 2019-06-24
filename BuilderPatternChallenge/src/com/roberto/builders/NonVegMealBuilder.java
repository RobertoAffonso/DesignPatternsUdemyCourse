package com.roberto.builders;

import com.roberto.Burger;
import com.roberto.ColdDrink;
import com.roberto.Meal;
import com.roberto.burgerModels.ChickenBurger;
import com.roberto.coldDrinkModels.Pepsi;
import com.roberto.interfaces.MealBuilder;

public class NonVegMealBuilder implements MealBuilder {
    Meal meal = new Meal();

    @Override
    public void buildBurger() {
        Burger chickenBurger = new ChickenBurger();
        meal.addItem(chickenBurger);
    }

    @Override
    public void buildDrink() {
        ColdDrink pepsi = new Pepsi();
        meal.addItem(pepsi);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
