package com.hitv.pattern.examples.decorator.coffee;

public class Test {
	public static void main(String args[]) {
		// 可以用任意装饰者佐料修饰添加或者没添加佐料的咖啡
		Beverage basicEpresso = new Espresso();
		printDetail("Basic Espresso", basicEpresso);

		Beverage mochaEspresso = new Mocha(basicEpresso);
		printDetail("Espresso with Mocha", mochaEspresso);

		Beverage doubleMochaEspresso = new Mocha(mochaEspresso);
		printDetail("Espresso with double Mocha", doubleMochaEspresso);

		Beverage soyMochaEspresso = new Soy(mochaEspresso);
		printDetail("Espresso with mocha and soy", soyMochaEspresso);

		Beverage whipSoyMochaEspresso = new Whip(soyMochaEspresso);
		printDetail("Espresso with whip soy and mocha", whipSoyMochaEspresso);

		Beverage basicHouseBlend = new HouseBlend();

		Beverage doublewhipSoyMochaBlend = new Whip(new Whip(new Soy(new Soy(
				new Mocha(new Mocha(basicHouseBlend))))));
		printDetail("Double three decorator...", doublewhipSoyMochaBlend);

		// 如何控制纯佐料饮料?
		// 在此例中,构造一个装饰者佐料对象必须包含一个材料实例.
		// 如果允许某装饰者材料搭配其他材料则添加该材料无参构造函数即可,即该佐料既可以是装饰者又是被装饰者.

	}

	private static void printDetail(String title, Beverage beverage) {
		if (beverage != null) {
			System.out.println(title + "\n" + beverage.getDescription()
					+ ",  $" + beverage.cost());
		}
	}
}
