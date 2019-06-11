package com.company;

import com.company.BollywoodMovieFactory.BollywoodMovieFactory;
import com.company.FactoryCreator.FactoryCreator;
import com.company.HollywoodMovieFactory.HollywoodMovieFactory;
import com.company.interfaces.BollywoodMovie;
import com.company.interfaces.HollywoodMovie;

public class Main {

    public static void main(String[] args) {

        System.out.println("***Abstract Factory Pattern Demo***");

        System.out.println("\n" + "***Hollywood Movies***");
        /**
         * Creates a new HollywoodMovieFactory
         */
        HollywoodMovieFactory hollywoodFactory = FactoryCreator.getInstance().getHollywoodMovieFactory();

        // Creates a new HollywoodMovie object, representing a Hollywood Action Movie
        HollywoodMovie hollywoodActionMovie = hollywoodFactory.getHollywoodMovie("action");

        // Calls the getMovieName() method within the hollywoodActionMovie object
        hollywoodActionMovie.getMovieName();

        // Creates a new HollywoodMovie object,
        HollywoodMovie hollywoodComedyMovie = hollywoodFactory.getHollywoodMovie("comedy");

        // Calls the getMovieName() method within the hollywoodComedyMovie object
        hollywoodComedyMovie.getMovieName();

        System.out.println("\n" + "***Bollywood Movies***");
        /**
         * Creates a new BollywoodMovieFactory
         */
        BollywoodMovieFactory bollywoodFactory = FactoryCreator.getInstance().getBollywoodMovieFactory();

        // Creates a new BollywoodMovie object, representing a bollywood action movie.
        BollywoodMovie bollywoodActionMovie = bollywoodFactory.getBollywoodMovie("action");

        // Calls the getMovieName method within the bollywoodActionMovie object.
        bollywoodActionMovie.getMovieName();

        // Creates a new BollywoodMovie object, representing a bollywood comedy movie.
        BollywoodMovie bollywoodComedyMovie = bollywoodFactory.getBollywoodMovie("comedy");

        // Calls the getMovieName method within the bollywoodComedyMovie object.
        bollywoodComedyMovie.getMovieName();
    }
}
