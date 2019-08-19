package com.roberto;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
	    Image image = new ProxyImage("lolololol.jpg");

	    // image wil be loaded from disk
	    image.display();
        System.out.println();
        image.display();
    }
}
