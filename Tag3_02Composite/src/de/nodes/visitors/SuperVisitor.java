package de.nodes.visitors;

import java.util.ArrayList;
import java.util.List;

import de.nodes.Konto;
import de.nodes.Kontogruppe;

public class SuperVisitor implements KontenVisitor {
	
	private List<KontenVisitor> visitors = new ArrayList<>();
	
	

	public boolean add(KontenVisitor e) {
		return visitors.add(e);
	}

	@Override
	public void init() {
		visitors.forEach(v->v.init());

	}

	@Override
	public void dispose() {
		visitors.forEach(v->v.dispose());

	}

	@Override
	public void visit(Konto konto) {
		visitors.forEach(v->v.visit(konto));

	}

	@Override
	public void visit(Kontogruppe kontogruppe) {
		visitors.forEach(v->v.visit(kontogruppe));

	}

}
