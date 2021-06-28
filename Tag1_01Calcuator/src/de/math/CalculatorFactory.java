package de.math;

import de.common.LoggerProxy;

public class CalculatorFactory {
	
	private static boolean logger = true;
	private static boolean secure = true;
	
	public static Calculator createInstance() {
		Calculator calculator = new CalculatorImpl();
		if(logger) calculator = new CalculatorLogger(calculator);
		if(logger) calculator =(Calculator) LoggerProxy.newInstance(calculator);
		if(secure) calculator = new CalculatorSecure(calculator);
		return calculator;
	}

}
