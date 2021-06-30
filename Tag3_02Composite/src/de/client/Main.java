package de.client;

import de.nodes.AbstractNode;
import de.nodes.Leaf;
import de.nodes.Node;

public class Main {

	public static void main(String[] args) {

		Node root = new Node("root");
		
		Node e1_1 = new Node("e1_1");
		Node e1_2 = new Node("e1_2");
		
		
		root.appendChild(e1_1);
		root.appendChild(e1_2);
		
		Node e2_1 = new Node("e2_1");
		Node e2_2 = new Node("e2_2");
		
		e1_1.appendChild(e2_1);
		e1_1.appendChild(e2_2);
		
		Leaf e2_3 = new Leaf("e2_3");
		Leaf e2_4 = new Leaf("e2_4");
		
		e1_2.appendChild(e2_3);
		e1_2.appendChild(e2_4);
		
		travers(e1_1);
	}
	
	public static void travers(AbstractNode abstractNode) {
		System.out.println(abstractNode);
		for (AbstractNode child : abstractNode.getChildren()) {
			travers(child);
		}	
		
	}

}
