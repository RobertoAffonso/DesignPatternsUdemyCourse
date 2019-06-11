package com.company.FactoryCreator;

import com.company.BollywoodMovieFactory.BollywoodMovieFactory;
import com.company.HollywoodMovieFactory.HollywoodMovieFactory;

public abstract class AbstractFactoryCreator {
    public abstract HollywoodMovieFactory getHollywoodMovieFactory();

    public abstract BollywoodMovieFactory getBollywoodMovieFactory();
}
