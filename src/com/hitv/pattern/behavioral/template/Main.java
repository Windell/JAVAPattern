package com.hitv.pattern.behavioral.template;

public class Main {
	public static void main(String args[]) {
		Template templateA=new TemplateImplA();
		Template templateB=new TemplateImplB();
		templateA.action();
		templateB.action();
	}
}
