package de.client;

import de.processors.CharacterCounter;
import de.processors.FileCopy;
import de.processors.FileProcessor;
import de.processors.LineCounter;

public class Main {

	public static void main(String[] args) {
		FileProcessor fileProcessor = new FileProcessor();
		fileProcessor.addCharacterHandler(new CharacterCounter());
		fileProcessor.addCharacterHandler(new LineCounter());
		
		
		fileProcessor.run("tbl_personen.sql");

	}

}
