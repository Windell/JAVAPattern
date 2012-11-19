package com.hitv.pattern.behavioral.template;

public abstract class Template {
	public abstract void print();

	public void action() {
		System.out.println("Print 5 times");
		for(int i=0;i<5;i++){
			print();
		}
	}
}
