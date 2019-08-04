package com.roberto;

public class ConcreteDecorator_EX2 extends AbstractDecorator{
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex-2***");
        super.doJob();
        System.out.println("I am explicity from EX2.");
    }
}
