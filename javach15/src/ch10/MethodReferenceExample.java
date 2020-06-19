package ch10;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator1, operator2, operator3, operator4;
		Calculator obj = new Calculator();

		// Static_Method
		operator1 = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator1.applyAsInt(1, 2));

		// Static_Method 참조 - 객체 기반 언어
		operator2 = Calculator::staticMethod;
		System.out.println("결과2: " + operator2.applyAsInt(3, 4));

		// Instatnce_method 참조
		operator3 = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator3.applyAsInt(5, 6));

		// 참조
		// Instance
		// Class 참조변수 = new class();
		// 참조변수::Instance_Method;
		operator4 = obj::instanceMethod;
		System.out.println("결과4: " + operator4.applyAsInt(7, 8));
	}
}

class Calculator {
	// Static_Method
	public static int staticMethod(int x, int y) {
		return x + y;
	}

	// Instance_Method
	public int instanceMethod(int x, int y) {
		return x + y;
	}
}