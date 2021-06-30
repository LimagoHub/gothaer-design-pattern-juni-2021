package de.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractKontoNode {
	
	private String label;
	private AbstractKontoNode parent = null;
	
	public AbstractKontoNode() {
		this("*#*");
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public AbstractKontoNode getParent() {
		return parent;
	}
	public void setParent(AbstractKontoNode parent) {
		this.parent = parent;
	}
	public AbstractKontoNode(String label) {
		this.label = label;
	}
	
	public List<AbstractKontoNode> getChildren() {
		return Collections.emptyList();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append(" label=");
		builder.append(label);
		return builder.toString();
	}
	
	
	
	public Iterator<AbstractKontoNode> iterator() {
		final List<AbstractKontoNode> result = new ArrayList<>();
		iteratorHelper(result);
		return result.iterator();
	}
	private void iteratorHelper(List<AbstractKontoNode> listToFill) {
		listToFill.add(this);
		getChildren().forEach(c->c.iteratorHelper(listToFill));
	}

}
