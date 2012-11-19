package com.hitv.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Citizen {
	private String help;

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	private List<Policeman> polices;

	public List<Policeman> getPolices() {
		return polices;
	}

	public abstract void sendMessage(String mess);

	public Citizen() {
		help = "help";
		polices = new ArrayList<Policeman>();
	}

	public void addPolice(Policeman pol) {
		polices.add(pol);
	}

	public void deletePolice(Policeman pol) {
		polices.remove(pol);
	}
}
