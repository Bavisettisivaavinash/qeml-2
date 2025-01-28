package com.epam.task6;

import com.epam.task5.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("john", 1, 1000000);
        SalaryCalculator calculator = d -> d + (d * 0.2);
        System.out.println(calculator.calculateSalary(e1.getBaseSalary()));
    }
}
