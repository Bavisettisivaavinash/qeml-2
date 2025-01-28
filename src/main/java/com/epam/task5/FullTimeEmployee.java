package com.epam.task5;

public class FullTimeEmployee extends Employee {
    private double percentage;

    public FullTimeEmployee(String name, int id, double baseSalary, double percentage) {
        super(name, id, baseSalary);
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

}
