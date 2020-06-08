package ch04.ch01;

public class A {
	final double PI = 3.141592;

	// final로 선언된 메소드는 자식 클래스에서 재정의 불가
	final void method1() {
		System.out.println("재정의 불가 메소드");
	}
}

class B extends A {
	// void method1() {
	// System.out.println("자식 클래스에서 재정의 된 메소드");
	// }
}