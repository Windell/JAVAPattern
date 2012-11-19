package com.hitv.pattern.behavioral.observer;

public class Main {
	public static void main(String args[]) {
		Citizen qingdaoC = new QingdaoCitizen();
		Citizen jinanC = new JinanCitizen();
		Policeman jinanP = new JinanPoliceman();
		Policeman qingdaoP = new QingdaoPiliceman();
		qingdaoC.addPolice(qingdaoP);
		jinanC.addPolice(jinanP);
		jinanC.addPolice(qingdaoP);
		qingdaoC.sendMessage("Please help me!");
		jinanC.sendMessage("Happy midautumn day!");
	}
}
