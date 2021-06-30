package de.processors;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import de.processors.handlers.CharacterHandler;

public class FileProcessor {
	
	// Liste der Empfänger
	private List<CharacterHandler> handlers = new ArrayList<>();
	
	
	// Methoden zum Registrieren und Deregistrieren
	public final void addCharacterHandler(CharacterHandler handler) {
		handlers.add(handler);
	}
	public final void removeCharacterHandler(CharacterHandler handler) {
		handlers.remove(handler);
	}
	
	// Zentraler Algorithmus zum Verarbeiten einzelner Zeichen (deshalb final)
	public final void run(String filename) {
		try (FileReader reader = new FileReader(filename)) {
			
			init();
			
			int value;
			while((value = reader.read()) != -1) {
				process((char) value);
			}
			
			dispose();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// "Fire-Event"-Methoden (Init für jeden Empfänger aufrufen)
	private void init() {
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.init();
		}
	}
	
	private void process(char c) { // (Process für jeden Empfänger aufrufen)
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.process(c);
		}
	}
	
	private void dispose() { //(Dispose für jeden Empfänger aufrufen)
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.dispose();
		}
	}

}
