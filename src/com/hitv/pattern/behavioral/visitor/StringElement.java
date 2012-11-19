package com.hitv.pattern.behavioral.visitor;

public class StringElement implements Visitable {
	private String str;

	public StringElement(String str) {
		this.str = str;
	}

	public String getString() {
		return str;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitString(this);
	}

	@Override
	public String getElementType() {
		return "String";
	}

}
