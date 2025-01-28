package com.epam.task5;

public class ContractEmployee extends Employee{
    private double contractAmount;

    public ContractEmployee(String name, int id, double baseSalary, double contractAmount) {
        super(name, id, baseSalary);
        this.contractAmount = contractAmount;
    }

    public double getContractAmount() {
        return contractAmount;
    }
}
