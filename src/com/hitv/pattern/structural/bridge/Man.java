package com.hitv.pattern.structural.bridge;

public class Man extends Person {
	public Man() {
		this.setType(" Man ");
	}

	@Override
	public void dress() {
		Clothing clothing = this.getClothing();
		clothing.personDressClothing(this);
	}

}
