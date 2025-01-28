package com.epam.task9;

import com.epam.task5.Employee;
import com.epam.task8.EmployeeManager;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeListCreation = new EmployeeManager();
        Predicate<Employee> filterOnSalary = e -> e.getBaseSalary()>55000;
        for(Employee e: employeeListCreation.getEmployees()){
            if (filterOnSalary.test(e)){
                System.out.println(e.getName());
            }
        }
    }
}
