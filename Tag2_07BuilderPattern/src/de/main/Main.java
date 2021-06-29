package de.main;

import de.pojos.Person;

public class Main {

	public static void main(String[] args) {
		//Person p = new Person("xyz", "abc", "fg");

		Person p = Person.builder().id("123").vorname("abc").nachname("fg").build();
		
		System.out.println(p);
	}

}
