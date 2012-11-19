package com.hitv.pattern.behavioral.iterator;

public class ObjectIteratorImpl implements ObjectIterator {
	private ObjectList list;
	private int index;

	public ObjectIteratorImpl(ObjectList list) {
		this.list = list;
		index = 0;
	}

	@Override
	public Object next() {
		Object object = list.get(index);
		index++;
		return object;
	}

	@Override
	public boolean hasNext() {
		return index < list.getSize();
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void last() {
		index = list.getSize();
	}

}
