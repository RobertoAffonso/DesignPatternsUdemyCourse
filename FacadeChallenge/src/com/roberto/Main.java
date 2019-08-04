package com.roberto;

public class Main {

    public static void main(String[] args) {
	    HotelKeeper keeper = new HotelKeeper(); // Creates a new Facade instance.
	    keeper.getVegMenu(); // Calls the getVegMenu method
	    keeper.getBothMenus(); // Calls the getBothMenus method
	    keeper.getNonVegMenu(); // Calls the getNonVegMenu method
    }
}
