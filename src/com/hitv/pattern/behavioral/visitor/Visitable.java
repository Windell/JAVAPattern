package com.hitv.pattern.behavioral.visitor;

/**
 * Suitable for these object will not change
 * */
public interface Visitable {

	public void accept(Visitor visitor);

	public String getElementType();
}
