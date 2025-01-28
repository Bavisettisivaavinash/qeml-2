package com.epam.task7;

import com.epam.task5.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("john", 1, 1000000);
        System.out.println("enter rating: ");
        Scanner scan = new Scanner(System.in);
        try{
            e1.setRating(scan.nextInt());
            BonusCalculator calc = (baseSalary, rating) -> baseSalary*(rating/10);
            System.out.println("bonus for "+e1.getName()+" is "+calc.calculateBonus(e1.getBaseSalary(), e1.getRating()));
        }catch (IllegalArgumentException ex){
            System.out.println("error: "+ex.getMessage());
        }
    }
}
