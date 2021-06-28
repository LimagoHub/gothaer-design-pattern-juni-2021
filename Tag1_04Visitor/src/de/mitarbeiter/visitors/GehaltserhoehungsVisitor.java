package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfaenger;

public class GehaltserhoehungsVisitor extends AbstractMitarbeiterVisitor{
	
	private double faktor;

	public GehaltserhoehungsVisitor(final double faktor) {
		this.faktor = faktor;
	}

	@Override
	public void visit(Gehaltsempfaenger gehaltsempfaenger) {
		gehaltsempfaenger.setGehalt(gehaltsempfaenger.getGehalt() * faktor);
	}
	
	

}
