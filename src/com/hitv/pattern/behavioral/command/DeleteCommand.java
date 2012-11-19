package com.hitv.pattern.behavioral.command;

public class DeleteCommand extends Command {

	public DeleteCommand(Document doc) {
		super(doc);
	}

	@Override
	public void execute() {
		System.out.println("Delete one line....");
		doc.stateList.add("Delete one line");
	}

}
