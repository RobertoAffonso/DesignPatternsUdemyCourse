package com.roberto;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Decorator pattern demo***");
        ConcreteComponent cc = new ConcreteComponent();

        ConcreteDecorator_EX1 concreteDecorator1 = new ConcreteDecorator_EX1();

        // Decorating ConcreteComponent Object cc with ConcreteDecorator_EX1
        concreteDecorator1.setComponent(cc);
        concreteDecorator1.doJob();


        // Decorating ConcreteComponent Object cc with ConcreteDecorator_EX1 and ConcreteDecorator_EX2
        ConcreteDecorator_EX2 concreteDecorator2 = new ConcreteDecorator_EX2();
        concreteDecorator2.setComponent(concreteDecorator1);
        concreteDecorator2.doJob();
    }
}
