package de.client;

import de.business.states.Front;

public class Main {

	public static void main(String[] args) {
		Front front = new Front();
		
		front.print();
		front.changeToB();
		front.print();
		front.changeToB();
	}

}
