package com.hitv.pattern.behavioral.cop;

public class DepartmentManagerHandler extends Handler {

	@Override
	public boolean handleRequest(int fee) {
		if (fee <= 1000) {
			System.out
					.println("I am Department Manager, your fee [" + fee
					+ "] in my range has been done.");
			return true;
		} else {
			return this.getSussessor().handleRequest(fee);
		}
	}

}
