package ch09;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;

		binaryOperator = BinaryOperator.maxBy((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice()));
		fruit = binaryOperator.apply(new Fruit("사과", 6000), new Fruit("수박", 60000));
		System.out.println("결과: " + fruit.getName() + "," + fruit.getClass());

		binaryOperator = BinaryOperator
				.minBy((o1, o2) -> o1.getPrice() < o2.getPrice() ? -1 : o1.getPrice() < o2.getPrice() ? 1 : 0);
		fruit = binaryOperator.apply(new Fruit("사과", 6000), new Fruit("수박", 60000));
		System.out.println("결과: " + fruit.getName() + "," + fruit.getClass());

		binaryOperator = BinaryOperator.maxBy((o1, o2) -> o1.getPrice() - o2.getPrice());
		fruit = binaryOperator.apply(new Fruit("사과", 6000), new Fruit("수박", 60000));
		System.out.println("결과: " + fruit.getName() + "," + fruit.getClass());

		binaryOperator = BinaryOperator.minBy((o1, o2) -> o1.getPrice() - o2.getPrice());
		fruit = binaryOperator.apply(new Fruit("사과", 6000), new Fruit("수박", 60000));
		System.out.println("결과: " + fruit.getName() + "," + fruit.getClass());
	}
}

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public final String getName() {
		return name;
	}

	public final int getPrice() {
		return price;
	}
}