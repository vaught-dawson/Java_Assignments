package dev.dawsonvaught.calculator;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;

	public Calculator() {
	}
	
	public Calculator(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResults() {
		return results;
	}
	
	public void performOperation() {
		switch (this.operation) {
			case "+":
				this.results = this.operandOne + this.operandTwo;
				return;
			case "-":
				this.results = this.operandOne - this.operandTwo;
				return;
		}
	}
}
