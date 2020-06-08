package ch06;

public class Calculator {
	int x, y;

	// 매개 변수를 받고 리턴 타입이 있는 메소드
	int plus(int x, int y) {
		return x + y;
	}

	// 매개 변수를 받고 리턴 타입이 없는 메소드
	void minus(int x, int y) {
		System.out.println(x - y);
	}

	// 매개 변수를 받지 않고 리턴 타입이 있는 메소드
	int multiple() {
		return x * y;
	}

	// 매개 변수를 받지 않고 리턴 타입도 없는 메소드
	void divide() {
		System.out.println(x / y);
	}
}