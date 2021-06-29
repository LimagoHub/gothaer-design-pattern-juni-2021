package de.math;

public class Calculator {
	
	private static Calculator instance = new Calculator();
	
	private Calculator() {
		
	}
	
	
	
	public static Calculator getInstance() {
		return instance;
	}



	private double memory = 0;

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}
	
	public void add(double value) {
		memory += value;
	}
	public void sub(double value) {
		memory -= value;
	}

	public void mult(double value) {
		memory *= value;
	}

	public void div(double value) {
		memory /= value;
	}

	public void clear() {
		memory = 0;
	}

	public void print() {
		System.out.println(memory);
	}
}
