package com.roberto;

/**
 * Class representing the Facade Design Pattern.
 */
public class HotelKeeper {

    /**
     *  Creates an instance of a VegRestaurant, then calls the showMenu method,
     *  displaying the menu items.
     */
    public void getVegMenu(){
        Hotel vegRestaurant = new VegRestaurant();
        vegRestaurant.getMenus().showMenu();
    }

    /**
     *  Creates an instance of a NonVegRestaurant, then calls the showMenu method,
     *  displaying the menu items.
     */
    public void getNonVegMenu(){
        Hotel nonVegRestaurant = new NonVegRestaurant();
        nonVegRestaurant.getMenus().showMenu();
    }

    /**
     *  Creates an instance of a VegNonBothRestaurant, then calls the showMenu method,
     *  displaying the menu items.
     */
    public void getBothMenus(){
        Hotel both = new VegNonBothRestaurant();
        both.getMenus().showMenu();
    }
}
