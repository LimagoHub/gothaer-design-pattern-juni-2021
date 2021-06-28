package de.singleton;

public class Main {

	public static void main(String[] args) {
		SingletonDemo.getInstance().log("Hallo");
		
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		
		System.out.println(s1 == s2);

	}

}
