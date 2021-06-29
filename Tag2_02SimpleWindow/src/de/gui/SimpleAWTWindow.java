package de.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleAWTWindow extends Frame {
	

	
	public SimpleAWTWindow() {
		setSize(300,300);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				beenden();
			}
		});
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
					beenden();
			}
		});
		
		Button button = new Button("Drück mich");
		button.addActionListener(e->this.doMyAction());
		add(button);
	}
	
	private void doMyAction() {
		System.out.println("Button wurde gefrückt");
	}
	
	private void beenden() {
		dispose();
		System.exit(0);
	}

	public static void main(String[] args) {
		new SimpleAWTWindow().setVisible(true);

	}

	

}
