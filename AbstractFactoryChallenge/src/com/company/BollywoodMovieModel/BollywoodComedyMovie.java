package com.company.BollywoodMovieModel;

import com.company.interfaces.BollywoodMovie;

public class BollywoodComedyMovie implements BollywoodMovie {

    @Override
    public void getMovieName() {
        System.out.println("This is a Bollywood Comedy Movie named: Kadhalan");
    }
}
