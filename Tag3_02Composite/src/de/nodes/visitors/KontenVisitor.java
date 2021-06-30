package de.nodes.visitors;

import de.nodes.Konto;
import de.nodes.Kontogruppe;

public interface KontenVisitor {
	
	void init();
	void dispose();
	void visit(Konto konto);
	void visit(Kontogruppe kontogruppe);

}
