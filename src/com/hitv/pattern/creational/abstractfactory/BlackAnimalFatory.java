package com.hitv.pattern.creational.abstractfactory;

public class BlackAnimalFatory implements IAnimalFactory {

	@Override
	public IDog createDog() {
		return new BlackDog();
	}

	@Override
	public ICat createCat() {
		return new BlackCat();
	}

}
