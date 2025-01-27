package com.epam.task4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<EmployeeSalary> employeeSalaries = Arrays.asList(new EmployeeSalary(60000), new EmployeeSalary(70000), new EmployeeSalary(80000));
        filterOnSalary(employeeSalaries, 65000);
    }

    private static void filterOnSalary(List<EmployeeSalary> employeeSalaries, double limiSalary) {
        Predicate<EmployeeSalary> filter = employee -> employee.getSalary() > limiSalary;
        for (EmployeeSalary e: employeeSalaries){
            if (filter.test(e))
                System.out.println(e.getSalary());
        }
    }
}
