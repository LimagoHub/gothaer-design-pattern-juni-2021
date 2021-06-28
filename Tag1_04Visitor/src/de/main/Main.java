package de.main;

import de.firma.Firma;
import de.mitarbeiter.Gehaltsempfaenger;
import de.mitarbeiter.Lohnempfaenger;
import de.mitarbeiter.visitors.GehaltserhoehungsVisitor;
import de.mitarbeiter.visitors.PrintVisitor;
import de.mitarbeiter.visitors.StatistikVisitor;

public class Main {

	public static void main(String[] args) {
		Firma firma = new Firma();
		
		firma.addMitarbeiter(new Gehaltsempfaenger("Mayer", 2000));
		firma.addMitarbeiter(new Gehaltsempfaenger("Müller", 3000));
		firma.addMitarbeiter(new Lohnempfaenger("Hinz"));
		firma.addMitarbeiter(new Lohnempfaenger("Kunz"));
		firma.addMitarbeiter(new Gehaltsempfaenger("Schulz", 2500));
		
		firma.iterate(new GehaltserhoehungsVisitor(1.03));
		firma.iterate(new PrintVisitor());
		firma.iterate(new StatistikVisitor());


	}

}
