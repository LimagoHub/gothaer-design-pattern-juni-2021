package de.business.states;

public abstract class AbstractState implements State{
	
	private final Front front;
	
	public AbstractState(Front front) {
		this.front = front;
	}

	
	
	public Front getFront() {
		return front;
	}



	@Override
	public void print() {
		throw new UnsupportedOperationException("Diese Methode macht in diesem Zustand keinen Sinn");
		
	}

	@Override
	public void changeToA() {
		throw new UnsupportedOperationException("Diese Methode macht in diesem Zustand keinen Sinn");
		
	}

	@Override
	public void changeToB() {
		throw new UnsupportedOperationException("Diese Methode macht in diesem Zustand keinen Sinn");
		
	}

}
