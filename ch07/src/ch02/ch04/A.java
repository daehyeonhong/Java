package ch02.ch04;

public class A {
	A() {
		System.out.println("A�� default ������");
	}

	A(int x) {
		System.out.println("A�� " + x + "�� �ִ� ������");
	}

	A(double x) {
		System.out.println("A�� " + x + "�� �ִ� ������");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B�� default ������");
	}

	B(int x) {
		super();
		System.out.println("B��" + x + "�� �ִ� ������");
	}
}