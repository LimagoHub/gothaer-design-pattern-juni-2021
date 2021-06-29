package de.main;

import java.util.Scanner;

import de.commands.Command;
import de.commands.CommandFactory;

public class Main {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("#>");
			String zeile = scanner.nextLine();
			if(zeile.equals("ende")) break;
			
			Command command = CommandFactory.createCommand(zeile);
			if(command == null) continue;
			
			command.execute();
		}

		scanner.close();
	}

}
