package dev.dawsonvaught.calculator;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.setOperandOne(10.5);
		test.setOperation("+");
		test.setOperandTwo(5.2);
		test.performOperation();
		System.out.println(test.getResults());
		
		Calculator test2 = new Calculator(10.5, "+", 5.2);
		test2.performOperation();
		System.out.println(test2.getResults());
	}

}
