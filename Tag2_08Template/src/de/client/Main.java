package de.client;

import de.processors.FileProcessor;
import de.processors.handlers.FileCopy;
import de.processors.handlers.counter.BracketCounter;
import de.processors.handlers.counter.CharacterCounter;
import de.processors.handlers.counter.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor();
		
		fileProcessor.addCharacterHandler(new CharacterCounter());
		fileProcessor.addCharacterHandler(new LineCounter());
		fileProcessor.addCharacterHandler(new BracketCounter());
		fileProcessor.addCharacterHandler(new FileCopy());
		
		
		fileProcessor.run("tbl_personen.sql");

	}

}
