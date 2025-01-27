package com.epam.task2;

public class Main {
    public static void main(String[] args) {
        double salary = 1000000;
        SalaryCalculator calc = new SalaryCalculator();
        try {
            System.out.println(calc.finalSalaryCalculator(salary));
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
}
