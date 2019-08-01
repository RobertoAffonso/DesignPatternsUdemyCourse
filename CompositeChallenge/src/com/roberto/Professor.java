package com.roberto;

import com.roberto.Component.Faculty;

public class Professor implements Faculty {

    private String name;

    private String position;

    private int officeNumber;

    public Professor(String name, String position, int officeNumber) {
        this.name = name;
        this.position = position;
        this.officeNumber = officeNumber;
    }

    @Override
    public String getDetails() {
        System.out.println("\t\t" + name + " is the " + position + " at office number: " + officeNumber);
        return "";
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }
}
