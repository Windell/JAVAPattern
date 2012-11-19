package com.hitv.pattern.behavioral.observer;

public class JinanCitizen extends Citizen {

	@Override
	public void sendMessage(String mess) {
		System.out.println("Citizen  from Jinan send out message");
		for(Policeman police:getPolices()){
			police.action(mess);
		}
	}

}
