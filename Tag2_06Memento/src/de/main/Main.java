package de.main;

import de.tiere.Schwein;
import de.tiere.SchweineMemento;

public class Main {

	public static void main(String[] args) {
		Schwein piggy = new Schwein("Miss Piggy");
		
		System.out.println(piggy);
		
		SchweineMemento memento = piggy.getMemento();
		
		piggy.fuettern();
		
		piggy = null;
		
		System.out.println(piggy);
		
		piggy = new Schwein();
		
		piggy.setMemento(memento);
		
		
		System.out.println(piggy);

	}

}
