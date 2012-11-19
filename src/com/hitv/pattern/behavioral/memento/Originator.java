package com.hitv.pattern.behavioral.memento;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento createMemento() {
		return new Memento(state);
	}

	public void setMemento(Memento memo) {
		state = memo.getState();
	}

	public void showState() {
		System.out.println("State:" + state);
	}
}
