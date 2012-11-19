package com.hitv.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		Visitor visitor = new VisitorImpl();
		StringElement strElement = new StringElement("ABC");
		strElement.accept(visitor);

		FloatElement floatElement = new FloatElement(234.56F);
		floatElement.accept(visitor);

		List list = new ArrayList();
		list.add(new StringElement("ABC"));
		list.add(new StringElement("ABC"));
		list.add(new FloatElement(234.56F));
		list.add(new FloatElement(234.56F));
		visitor.visitCollection(list);
	}
}
