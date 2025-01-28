package com.epam.task8;

public class Main {
    public static void main(String[] args) {
        EmployeeManager createListOfEmployees = new EmployeeManager();
        EmployeeManager.employees.sort((e1, e2) -> Double.compare(e1.getBaseSalary(), e2.getBaseSalary()));
        EmployeeManager.employees.forEach(e -> System.out.println(e.getName()));
    }
}
