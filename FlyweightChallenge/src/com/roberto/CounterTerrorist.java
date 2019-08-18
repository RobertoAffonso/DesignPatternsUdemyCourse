package com.roberto;

import java.util.ArrayList;
import java.util.List;

public class CounterTerrorist implements Player {

    private String task;
    private List<String> weapons = new ArrayList<>();

    public CounterTerrorist() {
        this.task = "Defuse the Bomb.";
    }

    @Override
    public void assignWeapon(String weapon) {
        if(weapon != null){
            this.weapons.add(weapon);
        } else {
            System.out.println("Error adding a new weapon.");
        }
    }

    @Override
    public void mission() {
        System.out.println(task);
    }

    @Override
    public String toString() {
        StringBuilder counterTerrorist = new StringBuilder("Counter Terrorist with weapons: ");
        for (String weapon : weapons) {
            counterTerrorist.append(weapon).append(" ");
        }
        counterTerrorist.append(" | ");
        counterTerrorist.append(task);
        return String.valueOf(counterTerrorist);
    }
}
