package com.hitv.pattern.behavioral.visitor;

import java.util.Collection;

/**
 * <pre>
 * 	Visitor pattern used for separating operations and objects.<br>
 * 	Visitor for operation ,Visitable element for objects.<br>
 * 	Easy to add operation and no changes in objects.<br>
 * <pre>
 * **/

public interface Visitor {

	public void visitString(StringElement strElement);

	public void visitFloat(FloatElement floatElement);

	public void visitCollection(Collection collection);

	// add new operation is easy, but if element object changes it is hard.
	public void visitCollectionTypes(Collection collection);
}
