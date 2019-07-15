package com.roberto;

public class ObjectAdapter {

    private IntegerValueInterface myInterface;

    public ObjectAdapter(IntegerValueInterface myInterface) {
        this.myInterface = myInterface;
    }

    public int getInteger(){
        return 2 + myInterface.getInteger();
    }
}
