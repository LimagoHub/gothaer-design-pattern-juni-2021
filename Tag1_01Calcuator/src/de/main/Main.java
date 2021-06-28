package de.main;

import de.client.CalcClient;
import de.math.Calculator;
import de.math.CalculatorImpl;
import de.math.CalculatorLogger;
import de.math.CalculatorSecure;

public class Main {

	private static boolean logger = true;
	private static boolean secure = true;
	
	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpl();
		if(logger) calculator = new CalculatorLogger(calculator);
		if(secure) calculator = new CalculatorSecure(calculator);
		new CalcClient(calculator).go();

	}

}
