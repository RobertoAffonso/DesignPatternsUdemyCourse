package com.roberto.Composite;

import com.roberto.Component.Faculty;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty {

    private String name;

    private String departmentName;

    private List<Faculty> professors;

    public Supervisor(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
        this.professors = new ArrayList<>();
    }

    @Override
    public String getDetails() {
        System.out.println("\t" + name + " is the Chair of " + departmentName + " Department");
        for (Faculty professor : professors) {
            professor.getDetails();
        }
        return "";
    }

    public void addProfessor(Faculty professor){
        this.professors.add(professor);
    }

    public void removeProfessor(Faculty professor){
        this.professors.remove(professor);
    }


}
