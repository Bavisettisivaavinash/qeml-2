package com.epam.task8;

import com.epam.task5.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeManager {
    private Employee emp1 = new Employee("Alice", 101, 51000);
    private Employee emp2 = new Employee("Bob", 102, 50000);
    private Employee emp3 = new Employee("Charlie", 103, 53000);
    private Employee emp4 = new Employee("David", 104, 52000);
    private Employee emp5 = new Employee("Eve", 105, 55000);
    private Employee emp6 = new Employee("Frank", 106, 54000);
    private Employee emp7 = new Employee("Grace", 107, 57000);
    private Employee emp8 = new Employee("Heidi", 108, 56000);
    private Employee emp9 = new Employee("Ivan", 109, 59000);
    private Employee emp10 = new Employee("Judy", 110, 58000);

    // Use Arrays.asList() to create a List of Employee
    private List<Employee> employees;

    {
        employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}