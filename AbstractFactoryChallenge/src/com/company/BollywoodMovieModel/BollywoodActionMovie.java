package com.company.BollywoodMovieModel;

import com.company.interfaces.BollywoodMovie;

public class BollywoodActionMovie implements BollywoodMovie {

    @Override
    public void getMovieName() {
        System.out.println("This is a Bollywood Action Movie named: India Under Fire.");
    }
}
