package com.roberto;

public interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble!");
    }

    @Override
    public void fly() {
        System.out.println("Turkey is now flying");
    }
}
