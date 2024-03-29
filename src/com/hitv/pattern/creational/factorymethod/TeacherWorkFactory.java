package com.hitv.pattern.creational.factorymethod;

public class TeacherWorkFactory implements IWorkFactory {

	@Override
	public Work getWork() {
		return new TeacherWork();
	}

}
