package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfaenger;
import de.mitarbeiter.Lohnempfaenger;

public abstract class AbstractMitarbeiterVisitor extends AbstractLifecycleMitarbeiterVisitor{

	@Override
	public void visit(Gehaltsempfaenger gehaltsempfaenger) {
		// Ok
		
	}

	@Override
	public void visit(Lohnempfaenger lohnempfaenger) {
		// Ok
		
	}

}
