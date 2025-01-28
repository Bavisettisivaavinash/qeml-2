package com.epam.task10;

import com.epam.task5.Employee;
import com.epam.task8.EmployeeManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        List<Double> annualSalary = new ArrayList<>();
        Function<Double, Double> convertToAnnual = d -> d*12;
        for (Employee e: manager.getEmployees()){
            annualSalary.add(convertToAnnual.apply(e.getBaseSalary()));
        }
        System.out.println(annualSalary);
    }
}
