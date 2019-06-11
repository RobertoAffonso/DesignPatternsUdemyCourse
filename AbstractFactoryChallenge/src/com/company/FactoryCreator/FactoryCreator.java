package com.company.FactoryCreator;

import com.company.BollywoodMovieFactory.BollywoodMovieFactory;
import com.company.HollywoodMovieFactory.HollywoodMovieFactory;

public class FactoryCreator extends AbstractFactoryCreator{
    private static FactoryCreator instance;

    public static FactoryCreator getInstance(){
        if(instance == null){
            return new FactoryCreator();
        }
        else {
            return instance;
        }
    }

    @Override
    public HollywoodMovieFactory getHollywoodMovieFactory() {
        return new HollywoodMovieFactory();
    }

    @Override
    public BollywoodMovieFactory getBollywoodMovieFactory() {
        return new BollywoodMovieFactory();
    }
}
