package de.trafficlight;

public class AbstractTrafficLightColorState extends AbstractTrafficLigthtState {

	public AbstractTrafficLightColorState(TrafficLight trafficLight) {
		super(trafficLight);
		
	}
	
	@Override
	public void switchOff() {
		trafficLight.current = trafficLight.offState;
	}

}
