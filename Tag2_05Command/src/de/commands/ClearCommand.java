package de.commands;

import de.math.Calculator;

public class ClearCommand extends AbstractCommand {

	private double state;
	
	
	@Override
	public void execute() {
		state = Calculator.getInstance().getMemory();
		Calculator.getInstance().clear();
	}
	
	@Override
	public boolean isQuery() {
		return false;
	}
	
	@Override
	public void undo() {
		Calculator.getInstance().setMemory(state);
	}

}
