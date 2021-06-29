package de.clientside;

import de.tiere.PigTooFatListener;
import de.tiere.Schwein;

public class Main {
	
	private Metzger metzger = new Metzger();
	private Spediteur spediteur = new Spediteur();
	
	public static void main(String[] args) {
		new Main().run();

	}

	private void run() {
		Schwein piggy = new Schwein("Miss Piggy");
		
		piggy.addPigTooFatListener(s->metzger.schlachten(s));
		piggy.addPigTooFatListener(s->spediteur.transportieren(s));
		
		for (int i = 0; i < 11; i++) {
			piggy.fuettern();
			
		}
		
	}
	
//	class SchweineMetzgerAdapter implements PigTooFatListener {
//
//		@Override
//		public void pigTooFat(Schwein dickesSchwein) {
//			metzger.schlachten(dickesSchwein);
//			
//		}
//		
//	}
//	class SchweineSpediteurAdapter implements PigTooFatListener {
//
//		@Override
//		public void pigTooFat(Schwein dickesSchwein) {
//			spediteur.transportieren(dickesSchwein);
//			
//		}
//		
//	}

}



class Metzger {

	
	public void schlachten(Object tier) {
		System.out.println("Messer wetz");
		
	}
	
}

class Spediteur {

	
	public void transportieren(Object ware) {
		System.out.println("Wir fahren auf der Autobahn");
		
	}
	
}
