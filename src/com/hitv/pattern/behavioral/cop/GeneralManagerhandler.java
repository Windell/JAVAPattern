package com.hitv.pattern.behavioral.cop;

public class GeneralManagerhandler extends Handler {

	@Override
	public boolean handleRequest(int fee) {
		if (fee > 3000) {
			System.out
					.println("I am sorry,  our company can't handle so large number["
							+ fee + "]");
			return false;
		} else {
			System.out.println("I am General Manager,Your fee[" + fee
					+ "]is allowed");
			return true;
		}
	}

}
