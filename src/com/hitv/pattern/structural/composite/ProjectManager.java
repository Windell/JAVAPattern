package com.hitv.pattern.structural.composite;

import java.util.ArrayList;

public class ProjectManager extends Employer {
	public ProjectManager(String name) {
		this.setName(name);
		this.setEmployers(new ArrayList<Employer>());
	}

	@Override
	public void add(Employer employer) {
		this.getEmployers().add(employer);

	}

	@Override
	public void delete(Employer employer) {
		this.getEmployers().remove(employer);
	}

}
