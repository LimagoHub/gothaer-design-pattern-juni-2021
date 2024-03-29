package de.processors.handlers.counter;

import de.processors.handlers.CharacterHandler;

public abstract class AbstractCounter implements CharacterHandler {

	protected int counter;
	
	@Override
	public void init() {
		counter = 0;
	}
	
	@Override
	public void dispose() {
		System.out.println(getClass().getSimpleName() + ": " + counter);
	}
}
