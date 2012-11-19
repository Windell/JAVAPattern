package com.hitv.pattern.creational.abstractfactory;

public class Main {
	public static void main(String args[]) {
		IAnimalFactory iBlackAnimalFactory = new BlackAnimalFatory();
		ICat blackCat=iBlackAnimalFactory.createCat();
		IDog blackDog=iBlackAnimalFactory.createDog();
		IAnimalFactory iWhiteAnimalFactory=new WhiteAnimalFactory();
		ICat whiteCat=iWhiteAnimalFactory.createCat();
		IDog whiteDog=iWhiteAnimalFactory.createDog();
		
		blackCat.catJump();
		blackDog.dogJump();
		whiteCat.catJump();
		whiteDog.dogJump();
	}
}
