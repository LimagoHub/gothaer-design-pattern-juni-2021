package de.mitarbeiter;

import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Lohnempfaenger extends AbstractMitarbeiter{
	
	private double stundenlohn = 20, arbeitszeit =36;

	public Lohnempfaenger(String name) {
		super(name);
		
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public double getArbeitszeit() {
		return arbeitszeit;
	}

	public void setArbeitszeit(double arbeitszeit) {
		this.arbeitszeit = arbeitszeit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", stundenlohn=");
		builder.append(stundenlohn);
		builder.append(", arbeitszeit=");
		builder.append(arbeitszeit);
		return builder.toString();
	}
	
	@Override
	public void accept(MitarbeiterVisitor visitor) {
		visitor.visit(this);
		
	}
	
	

}
