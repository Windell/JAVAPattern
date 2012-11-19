package com.hitv.pattern.behavioral.iterator;

public interface ObjectList {
	ObjectIterator iterator();

	Object get(int index);

	int getSize();

	void add(Object obj);

}
