package com.epam.task3;

public class SalaryManager {
    double calculateSalary(SalaryCalculator sc, BonusCalculator bc, double baseSalary){
        return sc.andThen(bc).apply(baseSalary);
    }
}
