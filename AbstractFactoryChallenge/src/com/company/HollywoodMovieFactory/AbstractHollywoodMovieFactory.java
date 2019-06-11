package com.company.HollywoodMovieFactory;

import com.company.interfaces.HollywoodMovie;

public abstract class AbstractHollywoodMovieFactory {
    public abstract HollywoodMovie getHollywoodMovie(String movieType);
}
