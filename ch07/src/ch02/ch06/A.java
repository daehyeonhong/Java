package ch02.ch06;

public class A {
	/*
	 * A() {
	 * 
	 * }
	 */

	A(int x, int y) {
		System.out.println("A������ " + x + "," + y + "����");
	}
}

class B extends A {
	B(int x, int y) {
		super(x, y);
		System.out.println("B������" + x + "," + y + "����");
	}
}