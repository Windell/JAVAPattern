package com.hitv.pattern.behavioral.mediator;

public class ColleagueB extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		setNumber(number);
		am.noticeA();
	}

}
