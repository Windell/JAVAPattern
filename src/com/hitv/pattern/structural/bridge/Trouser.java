package com.hitv.pattern.structural.bridge;

public class Trouser extends Clothing {

	@Override
	public void personDressClothing(Person person) {
		System.out.println(person.getType()+" wears Trouser");
	}

}
