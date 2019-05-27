package com.roberto;

interface displayModule {
    public void display();
}


class Monitor implements displayModule {

    @Override
    public void display(){
        System.out.println("Displaying through a Monitor.");
    }
}

class Projector implements displayModule {

    @Override
    public void display() {
        System.out.println("Displaying through a Projector.");
    }
}

public class Computer {
    displayModule dm;

    public void setDisplayModule(displayModule dm){
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();

        displayModule dm1 = new Monitor();
        displayModule dm2 = new Projector();

        computer.setDisplayModule(dm1);
        computer.display();

        computer.setDisplayModule(dm2);
        computer.display();
    }
}
