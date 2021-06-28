package de.mitarbeiter.visitors;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.Gehaltsempfaenger;
import de.mitarbeiter.Lohnempfaenger;

public class PrintVisitor extends AbstractLifecycleMitarbeiterVisitor{

	@Override
	public void visit(Gehaltsempfaenger gehaltsempfaenger) {
		print(gehaltsempfaenger);

	}

	@Override
	public void visit(Lohnempfaenger lohnempfaenger) {
		print(lohnempfaenger);

	}
	
	private void print(AbstractMitarbeiter mitarbeiter) {
		System.out.println(mitarbeiter);
	}

}
