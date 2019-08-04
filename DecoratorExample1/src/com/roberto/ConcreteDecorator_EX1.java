package com.roberto;

public class ConcreteDecorator_EX1 extends AbstractDecorator {

    @Override
    public void doJob(){
        super.doJob();
        System.out.println("I am explicity from EX_1");
    }
}
