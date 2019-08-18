package com.roberto;

import java.util.ArrayList;
import java.util.List;

public class Terrorist implements Player {
    private String task;

    private List<String> weapons;

    public Terrorist() {
        this.weapons = new ArrayList<>();
        this.task = "Plant the Bomb.";
    }

    @Override
    public void assignWeapon(String weapon) {
        if(weapon != null){
            this.weapons.add(weapon);
        } else {
            System.out.println("Error adding a new Weapon.");
        }
    }

    @Override
    public void mission() {
        System.out.println(task);
    }

    @Override
    public String toString() {
        StringBuilder terrorist = new StringBuilder("Terrorist with weapons: ");
        for (String weapon : weapons) {
            terrorist.append(weapon).append(" ");
        }
        terrorist.append(" | ");
        terrorist.append(task);
        return String.valueOf(terrorist);
    }
}
