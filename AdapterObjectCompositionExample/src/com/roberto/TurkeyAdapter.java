package com.roberto;

public class TurkeyAdapter implements Duck{

    /**
     * Uses an adaptee object, in order to use the adapter method
     * via object composition.
     */
    Turkey turkey;

    /**
     * Constructor method.
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
