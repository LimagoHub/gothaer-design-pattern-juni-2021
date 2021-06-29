package de.processors;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy implements CharacterHandler {

	private FileWriter writer;
	
	@Override
	public void init() {
		try {
			writer = new FileWriter("ausgabe.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void process(char c) {
		try {
			writer.write(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void dispose() {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
