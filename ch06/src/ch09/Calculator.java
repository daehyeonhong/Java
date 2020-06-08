package ch09;

public class Calculator {
	static final double PI = 3.141587;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	static int abs(int x, int y) {
		return x - y > 0 ? x - y : y - x;
	}
}