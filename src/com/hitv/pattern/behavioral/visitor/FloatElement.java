package com.hitv.pattern.behavioral.visitor;

public class FloatElement implements Visitable {
	private Float fe;

	public FloatElement(Float fe) {
		this.fe = fe;
	}

	public Float getFloat() {
		return fe;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitFloat(this);
	}

	@Override
	public String getElementType() {
		return "Float";
	}

}
