package de.client;

import java.util.Iterator;

import de.nodes.AbstractKontoNode;
import de.nodes.Konto;
import de.nodes.Kontogruppe;

public class Main {

	public static void main(String[] args) {

		Kontogruppe root = new Kontogruppe("root");
		
		Kontogruppe e1_1 = new Kontogruppe("e1_1");
		Kontogruppe e1_2 = new Kontogruppe("e1_2");
		
		
		root.appendChild(e1_1);
		root.appendChild(e1_2);
		
		Kontogruppe e2_1 = new Kontogruppe("e2_1");
		Kontogruppe e2_2 = new Kontogruppe("e2_2");
		
		e1_1.appendChild(e2_1);
		e1_1.appendChild(e2_2);
		
		Konto e2_3 = new Konto("e2_3");
		Konto e2_4 = new Konto("e2_4");
		
		e1_2.appendChild(e2_3);
		e1_2.appendChild(e2_4);
		
		
		for(Iterator<AbstractKontoNode> it = root.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
	}
	
	

}
