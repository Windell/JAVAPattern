package com.hitv.pattern.behavioral.cop;

public abstract class Handler {
	Handler sussessor;

	public Handler getSussessor() {
		return sussessor;
	}

	public void setSussessor(Handler sussessor) {
		this.sussessor = sussessor;
	}

	public abstract boolean handleRequest(int fee);
}
