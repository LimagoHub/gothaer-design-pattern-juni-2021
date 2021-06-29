package de.events;

import java.util.ArrayList;
import java.util.List;

public class PropertyChangedSupport {
	
	private final Object sender;
	private final List<PropertyChangedListener> listeners = new ArrayList<>();

	public PropertyChangedSupport(Object sender) {
		this.sender = sender;
	}

	public boolean addPropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		return listeners.add(propertyChangedListener);
	}

	public boolean removePropertyChangedListener(PropertyChangedListener propertyChangedListener) {
		return listeners.remove(propertyChangedListener);
	}
	
	public void firePropertyChangedEvent(PropertyChangedEvent event) {
		for (PropertyChangedListener propertyChangedListener : listeners) {
			propertyChangedListener.propertyChanged(event);
		}
	}
	public void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
		firePropertyChangedEvent(new PropertyChangedEvent(sender, propertyName, oldValue, newValue));
	}
	

}
