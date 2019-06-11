package com.company.HollywoodMovieFactory;

import com.company.HollywoodMovieModel.HollywoodActionMovie;
import com.company.HollywoodMovieModel.HollywoodComedyMovie;
import com.company.interfaces.HollywoodMovie;

public class HollywoodMovieFactory extends AbstractHollywoodMovieFactory {

    @Override
    public HollywoodMovie getHollywoodMovie(String movieType) {
        if(movieType.equalsIgnoreCase("action")){
            return new HollywoodActionMovie();
        }
        else if(movieType.equalsIgnoreCase("comedy")){
            return new HollywoodComedyMovie();
        }
        else {
            return null;
        }
    }
}
