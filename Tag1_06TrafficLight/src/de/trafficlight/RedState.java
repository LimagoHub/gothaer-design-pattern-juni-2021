package de.trafficlight;

public class RedState extends AbstractTrafficLightColorState{

	public RedState(TrafficLight trafficLight) {
		super(trafficLight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getActualColor() {
		return "RED";
	}

	@Override
	public void nextColor() {
		trafficLight.current = trafficLight.greenState;
	}
	
	

}
