package com.hitv.pattern.behavioral.mediator;

public class Main {
	public static void main(String args[]) {
		
		AbstractColleague a = new ColleagueA();
		AbstractColleague b = new ColleagueB();
		AbstractMediator am = new Mediator(a, b);
		a.setNumber(100, am);
		System.out.println("a>>>>" + a.getNumber() + "\n b<<<<" + b.getNumber());
		b.setNumber(200, am);
		System.out.println("a>>>>" + a.getNumber() + "\n b<<<<<" + b.getNumber());
	}
}
