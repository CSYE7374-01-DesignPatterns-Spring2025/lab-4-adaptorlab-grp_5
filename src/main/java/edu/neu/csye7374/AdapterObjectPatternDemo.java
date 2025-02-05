package edu.neu.csye7374;

import java.util.List;

public class AdapterObjectPatternDemo {
	public static void Demo() {
		CalculatableAPI calculator = new Calculator();
        AccumulatableAPI interfaceRegister = new CalculatorAdapter(calculator);

        List<Double> prices = List.of(10.0, 20.5, 5.25);
        double total1 = interfaceRegister.accumulation(prices);
        System.out.println("Total Accumulated Price: $" + total1);

        double remainingBalance1 = interfaceRegister.payment(50.0);
        System.out.println("Remaining Balance after Payment: $" + remainingBalance1);
        
        AccumulatableAPI register2 = new CalculatorClassAdapter();
        List<Double> prices2 = List.of(10.0, 22.5, 5.25);
        double total2 = register2.accumulation(prices2);
        System.out.println("Total Accumulated Price: $" + total2);

        double remainingBalance2 = register2.payment(50.0);
        System.out.println("Remaining Balance after Payment: $" + remainingBalance2);
	}

}
