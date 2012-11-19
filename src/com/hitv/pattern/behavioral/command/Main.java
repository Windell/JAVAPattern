package com.hitv.pattern.behavioral.command;

public class Main {
	public static void main(String args[]) {
		Document newDoc = new Document();
		Command command = new WriteCommand(newDoc);
		command.execute();
		command.execute();
		command = new DeleteCommand(newDoc);
		command.execute();
		command = new UndoCommand(newDoc);
		command.execute();
	}
}
