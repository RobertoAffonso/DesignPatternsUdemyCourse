package com.roberto;

import com.roberto.Component.Directory;
import com.roberto.Leaves.Developer;
import com.roberto.Leaves.Manager;

public class Main {

    public static void main(String[] args) {

	    Employee dev1 = new Developer("Roberto", 100, "Senior Developer");
	    Employee dev2 = new Developer("PH", 101, "Senior Developer");
	    Employee dev3 = new Developer("Masaru", 171, "Fraud");

        /**
         * Engineering Directory, representing a composite containing
         * a number of leaves.
         */
        Directory engDirectory = new Directory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
        engDirectory.addEmployee(dev3);

        Employee man1 =  new Manager("Walace", 200, "Senior Manager");
        Employee man2 = new Manager("Nonato", 201, "Project Manager");

        Directory accDirectory = new Directory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        /**
         * Company Directory, allows you to add Composites or Leaves.
         */
        Directory compDirectory = new Directory();
        compDirectory.addEmployee(engDirectory);
        compDirectory.addEmployee(accDirectory);

        accDirectory.showEmployeeDetails();

        engDirectory.showEmployeeDetails();

        /**
         * Following the composite design pattern, this method call
         * treats both composites and leaves, the same.
         */
        compDirectory.showEmployeeDetails();

    }
}
