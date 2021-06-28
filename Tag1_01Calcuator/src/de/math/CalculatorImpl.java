package de.math;

public class CalculatorImpl implements Calculator {
	
	/* package */ CalculatorImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double add(double a, double b) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a + b;
	}

	@Override
	public double sub(double a, double b) {
		return a - b;
	}

}
