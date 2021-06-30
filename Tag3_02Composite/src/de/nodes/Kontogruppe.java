package de.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kontogruppe extends AbstractKontoNode {
	
	private final List<AbstractKontoNode> children = new ArrayList<>();

	public Kontogruppe() {
		
	}

	public Kontogruppe(String label) {
		super(label);
		
	}
	
	@Override
	public List<AbstractKontoNode> getChildren() {
		return Collections.unmodifiableList(children);
	}
	
	public void appendChild(AbstractKontoNode child) {
		child.setParent(this);
		children.add(child);
	}

	public void removeChild(AbstractKontoNode child) {
		child.setParent(null);
		children.remove(child);
	}

}