package com.hitv.pattern.behavioral.visitor;

import java.util.Collection;
import java.util.Iterator;

public class VisitorImpl implements Visitor {

	@Override
	public void visitString(StringElement strElement) {
		System.out.println("StringElement:" + strElement.getString());
	}

	@Override
	public void visitFloat(FloatElement floatElement) {
		System.out.println("FloatElement:" + floatElement.getFloat());
	}

	@Override
	public void visitCollection(Collection collection) {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			if (object instanceof Visitable) {
				((Visitable) object).accept(this);
			}
		}
	}

	@Override
	public void visitCollectionTypes(Collection collection) {
		// TODO Auto-generated method stub
		
	}

}
