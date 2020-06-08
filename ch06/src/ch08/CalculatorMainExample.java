package ch08;

public class CalculatorMainExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.plus(10, 20);

		double result2 = c.plus(20, 30.3);

		System.out.println("result: " + result);
		System.out.println("result2: " + result2);
	}
}
