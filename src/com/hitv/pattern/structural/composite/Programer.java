package com.hitv.pattern.structural.composite;

public class Programer extends Employer {

	public Programer(String name) {
		this.setName(name);
		this.setEmployers(null);
	}

	@Override
	public void add(Employer employer) {
		// do nothing
	}

	@Override
	public void delete(Employer employer) {
		// do nothing
	}

}
