package com.epam.task1;

public class Main {
    public static void main(String[] args) {
        RegularSalaryCalculator salaryCalculator = new RegularSalaryCalculator();
        double baseSalary = 1000000;
        try {
            double inHand = salaryCalculator.calculate(baseSalary);
            System.out.println("effective salary is: " + inHand);
        }catch (IllegalArgumentException ex){
            System.out.println("error: "+ex.getMessage());
        }
    }
}
