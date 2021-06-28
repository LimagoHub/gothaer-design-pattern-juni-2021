package de.trafficlight;

public class TrafficLight {
	
	protected final TrafficLightState redState = new RedState(this);
	protected final TrafficLightState greenState = new GreenState(this);
	protected final TrafficLightState offState = new OffState(this);
	
	protected TrafficLightState current = offState;
	
	public void switchOn() {
		current.switchOn();
	}

	public void switchOff() {
		current.switchOff();
	}

	

	public String getActualColor() {
		return current.getActualColor();
	}

	public void nextColor() {
		current.nextColor();
	}
	
	

}
