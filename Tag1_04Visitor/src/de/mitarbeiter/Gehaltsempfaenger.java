package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Gehaltsempfaenger extends AbstractMitarbeiter {

	private double gehalt;
	
	public Gehaltsempfaenger(String name) {
		this(name, 1000);
		
	}

	public Gehaltsempfaenger(String name, double gehalt) {
		super(name);
		setGehalt(gehalt);
	}

	public double getGehalt() {
		return gehalt;
	}

	public final void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" gehalt=");
		builder.append(gehalt);
		
		return builder.toString();
	}

	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}
	
	

}
