package com.hitv.pattern.behavioral.mediator;

public abstract class AbstractMediator {
	protected AbstractColleague a;
	protected AbstractColleague b;

	public AbstractMediator(AbstractColleague a, AbstractColleague b) {
		this.a = a;
		this.b = b;
	}

	public abstract void noticeA();

	public abstract void noticeB();
}
