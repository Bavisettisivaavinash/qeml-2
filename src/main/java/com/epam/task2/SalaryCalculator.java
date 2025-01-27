package com.epam.task2;

public class SalaryCalculator {
    BonusCalculator bonus = salary -> salary * 0.2;

    public double finalSalaryCalculator(double baseSalary){
        if (baseSalary < 0){
            throw new IllegalArgumentException("salary must be greater than 0");
        }
        return bonus.calculateBonus(baseSalary) + baseSalary;
    }
}
