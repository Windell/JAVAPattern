package com.hitv.pattern.behavioral.mediator;

public class Mediator extends AbstractMediator {

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
	}

	@Override
	public void noticeA() {
		a.setNumber(b.getNumber()/100);
	}

	@Override
	public void noticeB() {
		// TODO Auto-generated method stub
		b.setNumber(a.getNumber()*100);
	}

}
