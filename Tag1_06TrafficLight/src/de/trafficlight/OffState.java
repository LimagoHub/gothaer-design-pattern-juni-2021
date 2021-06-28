package de.trafficlight;

public class OffState extends AbstractTrafficLigthtState {

	public OffState(TrafficLight trafficLight) {
		super(trafficLight);
		
	}

	@Override
	public void switchOn() {
		trafficLight.current = trafficLight.redState;
	}
	
	

}
