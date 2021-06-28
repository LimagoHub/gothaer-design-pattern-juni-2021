package de.firma;

import java.util.ArrayList;
import java.util.List;

import de.mitarbeiter.AbstractMitarbeiter;
import de.mitarbeiter.visitors.MitarbeiterVisitor;

public class Firma {
	
	private List<AbstractMitarbeiter> mitarbeiters = new ArrayList<>();
	
	public void addMitarbeiter(AbstractMitarbeiter mitarbeiter) {
		mitarbeiters.add(mitarbeiter);
	}

	public void removeMitarbeiter(AbstractMitarbeiter mitarbeiter) {
		mitarbeiters.remove(mitarbeiter);
	}
	
	public void iterate(MitarbeiterVisitor visitor) {
		visitor.init();
		mitarbeiters.forEach(m->m.accept(visitor));
		visitor.dispose();
	}
}
