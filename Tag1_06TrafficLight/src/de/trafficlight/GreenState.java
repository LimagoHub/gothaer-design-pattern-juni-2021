package de.trafficlight;

public class GreenState extends AbstractTrafficLightColorState {

	public GreenState(TrafficLight trafficLight) {
		super(trafficLight);
		
	}

	@Override
	public String getActualColor() {
		return "GREEN";
	}

	@Override
	public void nextColor() {
		trafficLight.current = trafficLight.redState;
	}
	
	

}
