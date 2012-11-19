package com.hitv.pattern.creational.builder;

public class PersonBuilderDirector {
	public Person constructPerson(PersonBuilder personBuilder) {
		personBuilder.buildHead();
		personBuilder.buildBody();
		personBuilder.buildFoot();
		return personBuilder.buildPerson();
	}
}
