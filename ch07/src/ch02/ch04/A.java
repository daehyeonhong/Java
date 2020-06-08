package ch02.ch04;

public class A {
	A() {
		System.out.println("A의 default 생성자");
	}

	A(int x) {
		System.out.println("A의 " + x + "가 있는 생성자");
	}

	A(double x) {
		System.out.println("A의 " + x + "가 있는 생성자");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B의 default 생성자");
	}

	B(int x) {
		super();
		System.out.println("B의" + x + "가 있는 생성자");
	}
}