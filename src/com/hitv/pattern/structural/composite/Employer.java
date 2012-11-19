package com.hitv.pattern.structural.composite;

import java.util.List;

public abstract class Employer {
	private String name;
	private List<Employer> employers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employer> getEmployers() {
		return employers;
	}

	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}

	public abstract void add(Employer employer);

	public abstract void delete(Employer employer);
}
