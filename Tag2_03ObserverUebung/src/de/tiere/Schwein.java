package de.tiere;

import java.util.ArrayList;
import java.util.List;

import de.events.PropertyChangedListener;
import de.events.PropertyChangedSupport;

public class Schwein {
	
	private List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
	private final PropertyChangedSupport propertyChangedSupport = new PropertyChangedSupport(this);
	
	public void addPigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.add(listener);
	}
	
	public void removePigTooFatListener(PigTooFatListener listener) {
		pigTooFatListeners.remove(listener);
	}
	
	
	
	
	public boolean addPropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		return propertyChangedSupport.addPropertyChangedListener(propertyChangedListener);
	}

	public boolean removePropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		return propertyChangedSupport.removePropertyChangedListener(propertyChangedListener);
	}

	private void firePigTooFatEvent() {
		for (PigTooFatListener pigTooFatListener : pigTooFatListeners) {
			pigTooFatListener.pigTooFat(this);
		}
	}
	
	private String name;
	private int gewicht;
	
	public Schwein() {
		this("nobody");
	}

	public Schwein(String name) {
		this.gewicht = 10;
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.equals(this.name)) return;
		propertyChangedSupport.firePropertyChangedEvent("name", this.name, this.name = name);
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		propertyChangedSupport.firePropertyChangedEvent("gewicht", this.gewicht, this.gewicht = gewicht);
		if(this.gewicht > 20) firePigTooFatEvent();
	}

	public void fuettern() {
		setGewicht(getGewicht() + 1);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schwein [name=");
		builder.append(name);
		builder.append(", gewicht=");
		builder.append(gewicht);
		builder.append("]");
		return builder.toString();
	}
	

}
