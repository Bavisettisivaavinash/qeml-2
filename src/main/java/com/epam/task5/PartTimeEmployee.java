package com.epam.task5;

public class PartTimeEmployee extends Employee{
    double payPerHour;
    int numberOfHours;

    public PartTimeEmployee(String name, int id, double baseSalary, double payPerHour, int numberOfHours) {
        super(name, id, baseSalary);
        this.payPerHour = payPerHour;
        this.numberOfHours = numberOfHours;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }
}
