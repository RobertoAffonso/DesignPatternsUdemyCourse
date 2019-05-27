package com.roberto;

class RealPrinter {
    // The delegate

    void print(){
        System.out.println("The Delegate");
    }
}

class Printer {
    // the Delegator
    RealPrinter p = new RealPrinter();

    // creating the Delegate
    void print(){
        p.print();
    }
}

public class Tester {
    public static void main(String[] args) {
        // in the real world, the user does not know of the RealPrinter object.
        Printer printer = new Printer();
        printer.print();
    }
}
