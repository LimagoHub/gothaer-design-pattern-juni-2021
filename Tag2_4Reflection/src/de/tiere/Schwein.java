package de.tiere;

import java.io.Serializable;

public class Schwein implements Serializable{
	
	
	
	
	private static final long serialVersionUID = 87011611799613841L;
	private String name;
	private int gewicht;
	
	public Schwein() { // 1. Bean Bedingung
		this("nobody");
	}

	public Schwein(String name) {
		this.gewicht = 10;
		this.name = name;
	}
	public String getName() { // Zugriff auf Felder über getter und setter
		return name;
	}

	public void setName(String name) {
		 this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	private void setGewicht(int gewicht) {
		 this.gewicht = gewicht;
		
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
