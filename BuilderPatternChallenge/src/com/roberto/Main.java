package com.roberto;

import com.roberto.builders.NonVegMealBuilder;
import com.roberto.builders.VegMealBuilder;
import com.roberto.interfaces.MealBuilder;

public class Main {

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Challenge***" + "\n");

        //Creates a new Director instance
        Director director = new Director();

        // Creates a new VegMealBuilder Object.
        MealBuilder vegMealBuilder = new VegMealBuilder();

        // Building a Vegetarian Meal
        System.out.println("Veg Meal");
        director.construct(vegMealBuilder); // Builds a new Vegetarian Meal.
        Meal vegMeal = director.getMeal();
        vegMeal.showItems(); // Prints out all objects, within the items list.
        vegMeal.getCost(); // Prints out the total cost from all items.

        System.out.print("\n");

        // Building a Non Vegetarian Meal
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        //Building a Non Vegetarian Meal
        System.out.println("Non-Veg Meal");
        director.construct(nonVegMealBuilder); // Builds a new Non Vegetarian Meal.
        Meal nonVegMeal = director.getMeal();
        nonVegMeal.showItems(); // Prints out all objects, within the items list.
        nonVegMeal.getCost(); // Prints out the total cost from all items.
    }

}