package com.hitv.pattern.behavioral.command;

public abstract class Command {
	Document doc;

	public Command(Document doc) {
		this.doc = doc;
	}

	public abstract void execute();
}
