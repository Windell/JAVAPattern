package com.hitv.pattern.creational.builder;

public class ManBuilder implements PersonBuilder {
	Person person;

	public ManBuilder() {
		person = new Man();
	}

	@Override
	public void buildHead() {
		person.setHead("Man's Head");
	}

	@Override
	public void buildBody() {
		person.setBody("Man's body ");
	}

	@Override
	public void buildFoot() {
		person.setFoot("Man's foot");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
