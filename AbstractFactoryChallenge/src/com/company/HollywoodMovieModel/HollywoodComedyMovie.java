package com.company.HollywoodMovieModel;

import com.company.interfaces.HollywoodMovie;

public class HollywoodComedyMovie implements HollywoodMovie {
    private String name;

    public HollywoodComedyMovie() {
    }

    @Override
    public void getMovieName() {
        if(getName() == null){
            setName("Naked Gun");
        }
        System.out.println("This is a Hollywood Comedy Movie named: " + getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
