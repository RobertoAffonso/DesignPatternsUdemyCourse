package com.company.HollywoodMovieModel;

import com.company.interfaces.HollywoodMovie;

public class HollywoodActionMovie implements HollywoodMovie {
    private String name;

    public HollywoodActionMovie() {
    }

    @Override
    public void getMovieName() {
        if(getName() == null){
            setName("Die Hard");
        }
        System.out.println("This is a Hollywood action movie named: " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
