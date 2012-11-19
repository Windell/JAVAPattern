package com.hitv.pattern.behavioral.memento;

public class Caretaker {
	private Memento memo;

	public Memento getMemo() {
		return memo;
	}

	public void setMemo(Memento memo) {
		this.memo = memo;
	}
}
