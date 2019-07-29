package com.roberto.Component;

import com.roberto.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a hierarchical Composite class
 * containing only Managers and their respective employees (childs)
 */
public class Manager implements Employee {

    private List<Employee> employeeList = new ArrayList<>();

    private String name;

    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee getEmployee(int i){
        return employeeList.get(i);
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("------------");
        System.out.println("Name = " + getName());
        System.out.println("Salary = " + getSalary());
        System.out.println("------------");

        for (Employee employee : employeeList) {
            employee.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        this.employeeList.remove(employee);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
