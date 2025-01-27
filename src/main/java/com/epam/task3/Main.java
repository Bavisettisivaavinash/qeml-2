package com.epam.task3;

public class Main {
    public static void main(String[] args) {
        SalaryManager sm = new SalaryManager();
        double v = sm.calculateSalary(baseSalary -> baseSalary, baseSalary -> baseSalary + (baseSalary * 0.2), 1000000);
        System.out.println(v);
    }
}
