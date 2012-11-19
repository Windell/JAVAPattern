package com.hitv.pattern.behavioral.mediator;

public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		// TODO Auto-generated method stub
		setNumber(number);
		am.noticeB();
	}

}
