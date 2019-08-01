package com.roberto;

import com.roberto.Component.Faculty;
import com.roberto.Composite.Dean;
import com.roberto.Composite.Supervisor;

public class Main {

    public static void main(String[] args) {
	    Faculty prof1 = new Professor("John", "Adjunct", 123);
        Faculty prof2 = new Professor("Jane", "Associate", 321);

        Faculty prof3 = new Professor("Dan", "Adjunct", 578);
        Faculty prof4 = new Professor("Anders", "Professor", 512);
        Faculty prof5 = new Professor("Robert", "Professor", 538);

        Supervisor supervisor1 = new Supervisor("Mrs.SDas", "Math");
        supervisor1.addProfessor(prof1);
        supervisor1.addProfessor(prof2);

        Supervisor supervisor2 = new Supervisor("Mr.V.Sarcar", "Computer Science");
        supervisor2.addProfessor(prof3);
        supervisor2.addProfessor(prof4);
        supervisor2.addProfessor(prof5);
//        supervisor2.removeProfessor(prof4);

        Dean dean = new Dean("S.Som");
        dean.addSupervisor(supervisor1);
        dean.addSupervisor(supervisor2);

        System.out.println("***COMPOSITE PATTERN DEMO***");
        System.out.println("\n" + "The college has the following structure: " + "\n");
        dean.getDetails();
    }
}
