package com.hitv.pattern.structural.facade;

public class Main {
	public static void main(String args[]) {
		
		Facade facade=new Facade();
		facade.actionA();
		facade.actionB();
		facade.actionC();
	}
}
