package com.roberto;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	    int c;
	    try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\Roberto\\IdeaProjects\\DecoratorExample2\\src\\com\\roberto\\test.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            InputStream in = new LowerCaseInputStream(bufferedInputStream);
            while ((c = in.read()) >= 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException ex){
	        ex.printStackTrace();
        }
    }
}
