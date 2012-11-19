package com.hitv.pattern.behavioral.observer;

public class QingdaoPiliceman implements Policeman {

	@Override
	public void action(String message) {
		System.out.println("Qingdao Police got message:" + message
				+ " ,will do some action now!");
	}

}
