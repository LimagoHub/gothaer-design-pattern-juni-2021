package de.trafficlight;

public interface TrafficLightState {
	
	String getActualColor();
	void nextColor();
	void switchOn();
	void switchOff();

}
