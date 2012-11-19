package com.hitv.pattern.behavioral.observer;

public class QingdaoCitizen extends Citizen {

	@Override
	public void sendMessage(String mess) {
		System.out.println("Qingdao Citizen send out message...");
		for (Policeman police : this.getPolices()) {
			police.action(mess);
		}
	}

}
