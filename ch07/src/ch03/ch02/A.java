package ch03.ch02;

public class A {
	void method1() {
		System.out.println("A의 method1");
	}
}

class B extends A {
	@Override // 컴파일러에게 재정의된 메소드임을 알림
	void method1() {// 재정의 조건: 부모 메소드와 선언부 시그니쳐가 같아야 함.
		System.out.println("B의 method1");
	}
}