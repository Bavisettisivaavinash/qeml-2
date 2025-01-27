package com.epam.task3;

import java.util.function.Function;

public interface SalaryCalculator extends Function<Double, Double> {
    @Override
    Double apply(Double aDouble);
}
