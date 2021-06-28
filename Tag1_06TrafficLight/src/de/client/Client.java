package de.client;

import de.trafficlight.TrafficLight;

public class Client {

	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		
		trafficLight.switchOn();
		
		for (int i = 0; i < 5; i++, trafficLight.nextColor()) {
			System.out.println(trafficLight.getActualColor());
			
		}
		
		trafficLight.switchOff();

	}

}
