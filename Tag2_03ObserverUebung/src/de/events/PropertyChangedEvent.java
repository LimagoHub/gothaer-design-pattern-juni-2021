package de.events;

public class PropertyChangedEvent {
	
	private final Object sender;
	private final String propertyName;
	private final Object oldValue;
	private final Object newValue;
	
	public PropertyChangedEvent(Object sender, String propertyName, Object oldValue, Object newValue) {
		this.sender = sender;
		this.propertyName = propertyName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public Object getSender() {
		return sender;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public Object getNewValue() {
		return newValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyChangedEvent [sender=");
		builder.append(sender);
		builder.append(", propertyName=");
		builder.append(propertyName);
		builder.append(", oldValue=");
		builder.append(oldValue);
		builder.append(", newValue=");
		builder.append(newValue);
		builder.append("]");
		return builder.toString();
	}
	

}
