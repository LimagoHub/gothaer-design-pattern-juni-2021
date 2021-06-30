package de.processors.handlers.counter;

import java.util.List;

public class BracketCounter extends AbstractCounter {
	
	private static final List<Character> brackets = List.of('{','}','(',')','[',']','<','>');

	@Override
	public void process(char c) {
		if(brackets.contains(c))
			counter ++;

	}

}
