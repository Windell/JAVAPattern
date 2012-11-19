package com.hitv.pattern.creational.builder;

public class LadyBuilder implements PersonBuilder {
	Person person;

	public LadyBuilder() {
		person = new Lady();
	}

	@Override
	public void buildHead() {
		person.setHead("Lady's head");
	}

	@Override
	public void buildBody() {
		person.setBody("Lady's body");
	}

	@Override
	public void buildFoot() {
		person.setFoot("Lady's foot");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
