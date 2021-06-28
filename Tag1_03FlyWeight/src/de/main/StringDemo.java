package de.main;

import java.time.Duration;
import java.time.Instant;

public class StringDemo {
	
	public static void main(String[] args) {
		StringBuilder myString = new StringBuilder();
		
		
		
		Instant start = Instant.now();
		
		for (int i = 0; i < 2_000_000; i++) {
			myString.append('a');
			
		}
		
		String realString = myString.toString();
		
		Instant ende = Instant.now();
		Duration duration = Duration.between(start, ende);
		
		System.out.println("Duration = " + duration.toMillis());
	}

}
