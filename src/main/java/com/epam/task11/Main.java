package com.epam.task11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Alice", "Developer", "IT", 70000),
                new Employee("Bob", "Designer", "Creative", 65000),
                new Employee("Charlie", "Analyst", "Finance", 75000),
                new Employee("David", "Manager", "HR", 78000),
                new Employee("Eve", "Consultant", "Sales", 72000),
                new Employee("Frank", "Engineer", "Production", 68000),
                new Employee("Grace", "Specialist", "Marketing", 66000),
                new Employee("Heidi", "Supervisor", "Logistics", 69000),
                new Employee("Ivan", "Coordinator", "Operations", 67000),
                new Employee("Judy", "Administrator", "Admin", 64000));

//        List<Employee> afterFilter = employeeList.stream().filter(e -> e.getRole().equals("Engineer")).filter(e -> e.getSalary() > 60000).collect(Collectors.toList());
//        System.out.println(afterFilter);
        System.out.println(employeeList.stream().map(Employee::getSalary).reduce(0, Integer::sum));
    }
}
