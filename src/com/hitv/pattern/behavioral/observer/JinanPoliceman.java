package com.hitv.pattern.behavioral.observer;

public class JinanPoliceman implements Policeman {

	@Override
	public void action(String mess) {
		System.out.println("Jinan Police got message:"+mess+" ,will do some action now!");
	}

}
