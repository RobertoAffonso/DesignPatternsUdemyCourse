package com.roberto;

import com.roberto.Component.Manager;
import com.roberto.Leaves.Developer;

public class Main {

    public static void main(String[] args) {

	    Employee dev1 = new Developer("Roberto", 100, "Senior Developer");
	    Employee dev2 = new Developer("PH", 101, "Senior Developer");
	    Employee dev3 = new Developer("Masaru", 171, "Fraud");

        /**
         * Creating a Manager, representing a composite containing
         * a number of leaves, represented by the employees.
         */
        Manager nonatoManager = new Manager("Nonato", 25000);
        nonatoManager.addEmployee(dev1);
        nonatoManager.addEmployee(dev2);

        Manager adissaoManager = new Manager("Adson", 25000);
        adissaoManager.addEmployee(dev3);

        Manager generalManager = new Manager("Walace", 50000);
        generalManager.addEmployee(nonatoManager);
        generalManager.addEmployee(adissaoManager);

        nonatoManager.showEmployeeDetails();
        adissaoManager.showEmployeeDetails();
        generalManager.showEmployeeDetails();


    }
}
