package com.roberto.Composite;

import com.roberto.Component.Faculty;

import java.util.ArrayList;
import java.util.List;

public class Dean implements Faculty {
    private String name;

    private List<Faculty> supervisors;

    public Dean(String name) {
        this.name = name;
        this.supervisors = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        System.out.println("Dr." + name + " is the Dean of Technology.");
        for(Faculty supervisor: supervisors){
            System.out.println("\t" + supervisor.getDetails());
        }
        return "";
    }

    public void addSupervisor(Supervisor supervisor){
        this.supervisors.add(supervisor);
    }

    public void removeSupervisor(Supervisor supervisor){
        this.supervisors.remove(supervisor);
    }
}
