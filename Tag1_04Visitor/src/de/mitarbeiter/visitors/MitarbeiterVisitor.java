package de.mitarbeiter.visitors;

import de.mitarbeiter.Gehaltsempfaenger;
import de.mitarbeiter.Lohnempfaenger;

public interface MitarbeiterVisitor {
	void init();
	void visit(Gehaltsempfaenger gehaltsempfaenger);
	void visit(Lohnempfaenger lohnempfaenger);
	void dispose();
}
