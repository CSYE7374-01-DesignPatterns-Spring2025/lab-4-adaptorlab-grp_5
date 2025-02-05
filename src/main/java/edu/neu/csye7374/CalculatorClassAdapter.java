package edu.neu.csye7374;

import java.util.List;

public class CalculatorClassAdapter extends Calculator implements AccumulatableAPI {
    private double sum;

    public CalculatorClassAdapter() {
        this.sum = 0;
    }

    @Override
    public double accumulation(List<Double> prices) {
        sum = 0;
        for (double price : prices) {
            sum = operation(OPERATION.ADD, sum, price);
        }
        return sum;
    }

    @Override
    public double payment(double cash) {
        return operation(OPERATION.SUB, cash, sum);
    }
}
