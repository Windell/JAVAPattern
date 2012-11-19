package com.hitv.pattern.behavioral.iterator;

public class ObjectListImpl implements ObjectList {

	public Object[] list;
	public int index;
	public int size;

	public ObjectListImpl() {
		list = new Object[100];
		size = 0;
		index = 0;
	}

	@Override
	public ObjectIterator iterator() {
		return new ObjectIteratorImpl(this);
	}

	@Override
	public Object get(int index) {
		return list[index];
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void add(Object obj) {
		if (size <= 100) {
			list[index++] = obj;
			size++;
		}
	}

}
