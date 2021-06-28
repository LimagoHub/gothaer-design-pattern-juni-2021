package de.trafficlight;

public abstract class AbstractTrafficLigthtState implements TrafficLightState {
	
	protected final TrafficLight trafficLight;

	
	
	public AbstractTrafficLigthtState(TrafficLight trafficLight) {
		this.trafficLight = trafficLight;
	}

	@Override
	public String getActualColor() {
		throw new UnsupportedOperationException("Upps");
	}

	@Override
	public void nextColor() {
		throw new UnsupportedOperationException("Upps");

	}

	@Override
	public void switchOn() {
		throw new UnsupportedOperationException("Upps");
		
	}

	@Override
	public void switchOff() {
		throw new UnsupportedOperationException("Upps");
		
	}
	
	

}
