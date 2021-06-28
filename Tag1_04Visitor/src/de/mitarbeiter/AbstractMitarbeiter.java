package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public abstract class AbstractMitarbeiter {
	
	private String name;

	public AbstractMitarbeiter(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void accept(MitarbeiterVisitor visitor);

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" name=");
		builder.append(name);
		builder.append("");
		return builder.toString();
	}
	
	

}
