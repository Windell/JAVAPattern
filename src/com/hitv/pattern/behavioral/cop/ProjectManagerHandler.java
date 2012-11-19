package com.hitv.pattern.behavioral.cop;

public class ProjectManagerHandler extends Handler {

	@Override
	public boolean handleRequest(int fee) {
		if (fee <= 500) {
			System.out.println("Yes, I am Project Manager,your request[" + fee
					+ "] is in my range, i did it.");
			return true;
		} else {
			return this.getSussessor().handleRequest(fee);
		}
	}

}
