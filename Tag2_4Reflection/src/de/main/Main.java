package de.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import de.tiere.Schwein;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		
		// 1. Methode
		Class<?> clazz = Schwein.class;
		
		// 2. Methode
		Schwein s = new Schwein();
		clazz = s.getClass();
		
		// 3. Methode
		clazz = Class.forName("de.tiere.Schwein");
		
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println("--------------------");
		
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("--------------------");
		methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println("--------------------");
		
		//Constructor<?> ctor = clazz.getConstructor(String.class);
		Object object = clazz.newInstance();
		System.out.println(object);
		
		Method m = clazz.getMethod("fuettern");
		m.invoke(object); // null bei statischen Methoden
		
		System.out.println(object);
		
		m = clazz.getDeclaredMethod("setGewicht", int.class);
		m.setAccessible(true);
		m.invoke(object, -100);
		
		
	}

}
