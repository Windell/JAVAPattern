package com.hitv.pattern.behavioral.command;

public class WriteCommand extends Command {

	public WriteCommand(Document doc) {
		super(doc);
	}

	@Override
	public void execute() {
		System.out.println("Write Command ");
		doc.stateList.add("write one line");
	}

}
