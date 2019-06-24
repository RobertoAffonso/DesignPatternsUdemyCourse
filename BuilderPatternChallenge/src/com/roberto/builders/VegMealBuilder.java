package com.roberto.builders;

import com.roberto.Burger;
import com.roberto.ColdDrink;
import com.roberto.Meal;
import com.roberto.burgerModels.VeggieBurger;
import com.roberto.coldDrinkModels.Coke;
import com.roberto.interfaces.MealBuilder;

public class VegMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void buildBurger() {
        Burger veggieBurger = new VeggieBurger();
        meal.addItem(veggieBurger);
    }

    @Override
    public void buildDrink() {
        ColdDrink coke = new Coke();
        meal.addItem(coke);
    }

    @Override
    public Meal getMeal() {
        return this.meal;
    }
}
