package com.hitv.pattern.behavioral.iterator;

public class Main {
	public static void main(String args[]) {
		ObjectList list=new ObjectListImpl();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		System.out.println("Size:"+list.getSize());
		ObjectIterator iterator=new ObjectIteratorImpl(list);
		while(iterator.hasNext()){
			System.out.println(">>>>>"+iterator.next());
		}
		
		for(int i=0;i<list.getSize();i++){
			System.out.println("<<<<<"+list.get(i));
			
		}
	}
}
