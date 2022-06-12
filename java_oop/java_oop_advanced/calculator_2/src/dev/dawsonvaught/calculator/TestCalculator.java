package dev.dawsonvaught.calculator;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.performOperation(10.5);
		test.performOperation("+");
		test.performOperation(5.2);
		test.performOperation("*");
		test.performOperation(10);
		test.performOperation("=");
		System.out.println(test.getResults());
	}

}
