package com.roberto;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

interface Restaurant {
    public void takeTelephoneOrder();
}

interface PresentialPayment {
    public void payInPerson();
}

interface OnlinePayment {
    public void payOnline();
}

interface OnlineOrder {
    public void acceptOnlineOrder();
}

interface WalkInOrder {
    public void walkInCustomerOrder();
}

class OnlineClienteImpl implements OnlineOrder, OnlinePayment {

    @Override
    public void acceptOnlineOrder() {

    }

    @Override
    public void payOnline() {

    }
}
