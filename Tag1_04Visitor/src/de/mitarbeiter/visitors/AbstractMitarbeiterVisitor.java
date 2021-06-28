package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfaenger;
import de.mitarbeiter.Lohnempfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor{

	@Override
	public void visit(Gehaltsempfaenger gehaltsempfaenger) {
		// Ok
		
	}

	@Override
	public void visit(Lohnempfaenger lohnempfaenger) {
		// Ok
		
	}

}
