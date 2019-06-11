package com.company.BollywoodMovieFactory;

import com.company.interfaces.BollywoodMovie;

public abstract class AbstractBollywoodMovieFactory {

    public abstract BollywoodMovie getBollywoodMovie(String movieGenre);
}
