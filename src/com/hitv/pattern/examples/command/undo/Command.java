package com.hitv.pattern.examples.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
