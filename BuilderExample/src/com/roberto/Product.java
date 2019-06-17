package com.roberto;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(String part){
        this.parts.addLast(part);
    }

    public void show(){
        System.out.println("\n Product completed as below");

        for(int i = 0; i < parts.size(); i++){
            System.out.println(parts.get(i));
        }
    }
}
