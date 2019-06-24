package com.roberto;

import com.roberto.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items;

    /**
     * Constructor Method
     */
    public Meal() {
        this.items = new ArrayList<>();
    }

    /**
     * Method responsible for adding a new Item to the items
     * ArrayList.
     * @param item
     */
    public void addItem(Item item){
        if(item != null){
            this.items.add(item);
        }
        else{
            System.out.println("Item must be different than null.");
        }
    }

    /**
     * Method responsible for displaying the total cost of all items
     * inside the items ArrayList
     */
    public void getCost(){
        double totalCost = 0;
        for (Item item : items) {
            totalCost = totalCost + item.getPrice();
        }
        System.out.println("Total Cost: " + totalCost);
    }

    /**
     * Method responsible for displaying every single item
     * within the items List.
     */
    public void showItems(){
        for (Item item : items) {
            System.out.println("Item : " + item.getName() + ", " +
                               "Packing : " + item.getPacking() + ", " +
                               "Price : " + item.getPrice());
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
