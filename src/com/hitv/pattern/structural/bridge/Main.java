package com.hitv.pattern.structural.bridge;

public class Main {
	public static void main(String args[]) {

		// 接口与具体实现的解耦,两个接口类的调用在运行时即可动态指定为其对应两个实现类的调用
		Clothing jacket = new Jacket();
		Clothing trouser = new Trouser();
		Person man = new Man();
		Person lady = new Lady();

		jacket.personDressClothing(man);
		jacket.personDressClothing(lady);

		trouser.personDressClothing(man);
		trouser.personDressClothing(lady);
	}
}
