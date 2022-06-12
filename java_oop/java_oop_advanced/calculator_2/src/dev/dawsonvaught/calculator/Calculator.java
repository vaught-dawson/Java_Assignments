package dev.dawsonvaught.calculator;

import java.util.ArrayList;

public class Calculator {
	private ArrayList<String> calculation = new ArrayList<String>();
	private double results;

	public Calculator() {
	}

	public ArrayList<String> getCalculation() {
		return calculation;
	}

	public void setCalculation(ArrayList<String> calculation) {
		this.calculation = calculation;
	}

	public double getResults() {
		calculate();
		return results;
	}

	public void performOperation(String val) {
		this.calculation.add(val);
	}
	
	public void performOperation(double val) {
		this.calculation.add(String.valueOf(val));
	}

	private void calculate() {
		while (this.calculation.indexOf("*") != -1) {
			int index = this.calculation.indexOf("*");
			double subCalc = Double.parseDouble(this.calculation.get(index - 1));
			subCalc *= Double.parseDouble(this.calculation.remove(index + 1));
			
			this.calculation.set(index - 1, String.valueOf(subCalc));
			this.calculation.remove(index);
		}
		
		while (this.calculation.indexOf("/") != -1) {
			int index = this.calculation.indexOf("/");
			double subCalc = Double.parseDouble(this.calculation.get(index - 1));
			subCalc /= Double.parseDouble(this.calculation.remove(index + 1));
			
			this.calculation.set(index - 1, String.valueOf(subCalc));
			this.calculation.remove(index);
		}
		
		while (this.calculation.indexOf("+") != -1) {
			int index = this.calculation.indexOf("+");
			double subCalc = Double.parseDouble(this.calculation.get(index - 1));
			subCalc += Double.parseDouble(this.calculation.remove(index + 1));
			
			this.calculation.set(index - 1, String.valueOf(subCalc));
			this.calculation.remove(index);
		}
		
		while (this.calculation.indexOf("-") != -1) {
			int index = this.calculation.indexOf("-");
			double subCalc = Double.parseDouble(this.calculation.get(index - 1));
			subCalc -= Double.parseDouble(this.calculation.remove(index + 1));
			
			this.calculation.set(index - 1, String.valueOf(subCalc));
			this.calculation.remove(index);
		}
		
		while (this.calculation.indexOf("=") != -1) {
			this.calculation.remove(this.calculation.indexOf("="));
		}

		
		this.results = Double.parseDouble(this.calculation.get(0));
	}
}
