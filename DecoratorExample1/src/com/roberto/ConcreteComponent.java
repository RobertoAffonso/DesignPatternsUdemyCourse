package com.roberto;

public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a concrete component. I am closed for modification.");
    }
}
