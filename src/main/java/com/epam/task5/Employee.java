package com.epam.task5;

public class Employee {
    private String name;
    private int id;
    private double baseSalary;
    private int rating;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setRating(int rating) {
        if (rating <= 10 && rating >= 1){
            this.rating = rating;
        }else {
            throw new IllegalArgumentException("rating should be in between 1 and 10");
        }
    }

    public int getRating() {
        return rating;
    }
}
