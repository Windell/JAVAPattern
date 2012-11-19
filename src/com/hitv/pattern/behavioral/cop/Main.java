package com.hitv.pattern.behavioral.cop;

public class Main {
	public static void main(String args[]) {
		Handler pmHandler = new ProjectManagerHandler();
		Handler dmHandler = new DepartmentManagerHandler();
		Handler gmHandler = new GeneralManagerhandler();
		pmHandler.setSussessor(dmHandler);
		dmHandler.setSussessor(gmHandler);

		pmHandler.handleRequest(100);
		
		pmHandler.handleRequest(600);
		pmHandler.handleRequest(1500);
		pmHandler.handleRequest(10000);
		
	}
}
