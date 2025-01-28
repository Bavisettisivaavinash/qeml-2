package com.epam.task5;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee("avinash", 1, 1000000, 0.2);
        PartTimeEmployee partTime = new PartTimeEmployee("john", 2, 0, 80, 40);
        ContractEmployee contractor = new ContractEmployee("lucy", 3, 0, 4000000);

        VariableSalaryCalculator fulltimeo = (b, p) -> b + (b * p);
        System.out.println(fulltimeo.calculate(fullTime.getBaseSalary(), fullTime.getPercentage()));

        VariableSalaryCalculator partTimeo = (ph, nh) -> ph * nh;
        System.out.println(partTimeo.calculate(partTime.getNumberOfHours(), partTime.getPayPerHour()));

        VariableSalaryCalculator contracto = (b, p) -> b + p;
        System.out.println(contracto.calculate(contractor.getBaseSalary(), contractor.getContractAmount()));

    }
}
