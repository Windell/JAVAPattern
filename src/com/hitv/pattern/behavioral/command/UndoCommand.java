package com.hitv.pattern.behavioral.command;

public class UndoCommand extends Command {

	public UndoCommand(Document doc) {
		super(doc);
	}

	@Override
	public void execute() {
		System.out.println("Undo a command...");
		if (doc.stateList.size() > 1) {
			String lastcommand = doc.stateList.remove(doc.stateList.size() - 1);
			System.out.println("Removed..." + lastcommand);
			System.out.println("Now the lat command is:"
					+ doc.stateList.get(doc.stateList.size() - 1));
		}
	}

}
