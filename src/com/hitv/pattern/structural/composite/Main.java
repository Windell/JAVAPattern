package com.hitv.pattern.structural.composite;

public class Main {
	public static void main(String args[]) {
		Programer programerA = new Programer("CoderA");
		Programer programerB = new Programer("CodeB");
		ProjectAssistant assistent = new ProjectAssistant("Assistant");
		ProjectManager pm = new ProjectManager("PM");
		pm.add(programerA);
		pm.add(programerB);
		pm.add(assistent);
		System.out.println("Employers.....");
		for (Employer employer : pm.getEmployers()) {
			System.out.println(employer.getName());
		}

		pm.delete(programerB);
		System.out.println("Enployers after lay off ....");
		for (Employer employer : pm.getEmployers()) {
			System.out.println(employer.getName());
		}
	}
}
