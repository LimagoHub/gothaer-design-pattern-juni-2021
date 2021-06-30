package de.nodes;

import de.nodes.visitors.KontenVisitor;

public class Konto extends AbstractKontoNode {
	
	private double saldo = 0;

	public Konto() {
		
	}

	public Konto(String label) {
		super(label);
		
	}
	
	public Konto(String label, double saldo) {
		super(label);
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", Saldo = " + saldo;
	}

	@Override
	public void accept(KontenVisitor visitor) {
		visitor.visit(this);
		
	}

}
