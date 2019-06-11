package com.company.BollywoodMovieFactory;

import com.company.BollywoodMovieModel.BollywoodActionMovie;
import com.company.BollywoodMovieModel.BollywoodComedyMovie;
import com.company.interfaces.BollywoodMovie;

public class BollywoodMovieFactory extends AbstractBollywoodMovieFactory{

    @Override
    public BollywoodMovie getBollywoodMovie(String movieGenre) {
        if(movieGenre.equalsIgnoreCase("action")){
            return new BollywoodActionMovie();
        }
        else if(movieGenre.equalsIgnoreCase("comedy")){
            return new BollywoodComedyMovie();
        }
        else{
            return null;
        }
    }
}
