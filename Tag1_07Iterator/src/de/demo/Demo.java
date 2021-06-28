package de.demo;

import java.util.Iterator;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		List<String> strings = List.of("eins","zwei","drei", "vier");
		
		for(String s: strings) {
			System.out.println(s);
		}
		
		// strings.forEach(System.out::println);
		
		Iterator<String> it = strings.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
