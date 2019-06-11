package com.company;

public class AnimalFactory extends AbstractAnimalFactory{

    public static Animal getAnimal(String animalType)throws Exception{
        if(animalType.equalsIgnoreCase("TIGER")){
            return new Tiger();
        }
        else if(animalType.equalsIgnoreCase("DUCK")){
            return new Duck();
        }
        else {
            return null;
        }
    }
}
