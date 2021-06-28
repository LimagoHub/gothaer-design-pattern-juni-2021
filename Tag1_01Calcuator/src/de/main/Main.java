package de.main;

import de.client.CalcClient;
import de.math.CalculatorFactory;

public class Main {


	
	public static void main(String[] args) {
		
		new CalcClient(CalculatorFactory.createInstance()).go();

	}

}
