package de.processors;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
	
	private List<CharacterHandler> handlers = new ArrayList<>();
	
	public final void addCharacterHandler(CharacterHandler handler) {
		handlers.add(handler);
	}
	public final void removeCharacterHandler(CharacterHandler handler) {
		handlers.remove(handler);
	}
	
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
	
	private void init() {
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.init();
		}
	}
	
	private void process(char c) {
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.process(c);
		}
	}
	
	private void dispose() {
		for (CharacterHandler characterHandler : handlers) {
			characterHandler.dispose();
		}
	}

}
