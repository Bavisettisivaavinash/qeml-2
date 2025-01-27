package com.epam.task1;

public class RegularSalaryCalculator implements CalculateSalary{
    @Override
    public double calculate(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0");
        }
        double tax = baseSalary * 0.2; // Assume 20% tax
        double bonus = baseSalary * 0.1; // Assume 10% bonus
        return baseSalary - tax + bonus;
    }
}
