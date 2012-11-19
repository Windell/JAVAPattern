package com.hitv.pattern.behavioral.memento;

public class Main {
	public static void main(String args[]) {
		Originator org = new Originator();
		org.setState("StateA");
		Caretaker ct = new Caretaker();
		ct.setMemo(org.createMemento());
		org.setState("StateB");
		org.showState();

		org.setMemento(ct.getMemo());
		org.showState();
	}
}
