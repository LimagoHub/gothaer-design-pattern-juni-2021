package de.main;

import java.time.Duration;
import java.time.Instant;

import de.client.CalcClient;
import de.common.LoggerProxy;
import de.math.Calculator;
import de.math.CalculatorImpl;
import de.math.CalculatorLogger;
import de.math.CalculatorSecure;

public class Main {

	private static boolean logger = true;
	private static boolean secure = true;
	
	public static void main(String[] args) {
		
		
		
		
		Calculator calculator = new CalculatorImpl();
		//if(logger) calculator = new CalculatorLogger(calculator);
		if(logger) calculator =(Calculator) LoggerProxy.newInstance(calculator);
		if(secure) calculator = new CalculatorSecure(calculator);
		new CalcClient(calculator).go();

	}

}
