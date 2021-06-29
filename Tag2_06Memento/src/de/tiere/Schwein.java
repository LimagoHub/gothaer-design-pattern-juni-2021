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
	
	public SchweineMemento getMemento() {
		return new MySchweineMemento(name, gewicht);
	}
	
	public void setMemento(SchweineMemento schweineMemento) {
		MySchweineMemento mySchweineMemento = (MySchweineMemento) schweineMemento;
		setName(mySchweineMemento.getName());
		setGewicht(mySchweineMemento.getGewicht());
	}
	
	private static class MySchweineMemento implements SchweineMemento {
		
		
		private static final long serialVersionUID = -5414076675182903261L;
		private final String name;
		private final int gewicht;
		
		public MySchweineMemento(final String name, final int gewicht) {
			this.name = name;
			this.gewicht = gewicht;
		}

		public String getName() {
			return name;
		}

		public int getGewicht() {
			return gewicht;
		}
		
		
	}
}
