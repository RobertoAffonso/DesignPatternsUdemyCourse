package com.roberto;

public class Main {

    public static void main(String[] args) {
	    Service service = new ServiceA();
	    Client client = new Client(service);
	    client.doSomething();

	    client.setService(service);
    }
}

interface Service {
    void write(String message);
}

class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println("Hello World!");
    }
}

class Client {
    private Service myService;

    // Injection via the constructor
    public Client(Service service){
        this.myService = service;
    }

    // Injection via the setter method
    public void setService(Service service){
        this.myService = service;
    }

    public void doSomething(){
        System.out.println("LOLOLOLOLOLOL");
    }
}
