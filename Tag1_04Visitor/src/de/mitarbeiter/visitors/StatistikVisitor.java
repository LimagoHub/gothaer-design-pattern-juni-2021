package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfaenger;
import de.mitarbeiter.Lohnempfaenger;

public class StatistikVisitor implements MitarbeiterVisitor{
	
	private int lohnempfaengerAnzahl = 0;
	private int gehaltsempfaengerAnzahl = 0;
	
	@Override
	public void visit(Gehaltsempfaenger gehaltsempfaenger) {
		gehaltsempfaengerAnzahl ++;
		
	}

	@Override
	public void visit(Lohnempfaenger lohnempfaenger) {
		lohnempfaengerAnzahl ++;
		
	}

	public int getLohnempfaengerAnzahl() {
		return lohnempfaengerAnzahl;
	}

	public int getGehaltsempfaengerAnzahl() {
		return gehaltsempfaengerAnzahl;
	}
	
	
	public int getGesamtAnzahl() {
		return gehaltsempfaengerAnzahl + lohnempfaengerAnzahl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatistikVisitor [getLohnempfaengerAnzahl()=");
		builder.append(getLohnempfaengerAnzahl());
		builder.append(", getGehaltsempfaengerAnzahl()=");
		builder.append(getGehaltsempfaengerAnzahl());
		builder.append(", getGesamtAnzahl()=");
		builder.append(getGesamtAnzahl());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void init() {
		lohnempfaengerAnzahl = 0;
		gehaltsempfaengerAnzahl = 0;
		
	}

	@Override
	public void dispose() {
		System.out.println(this);
		
	}
	
	


}
