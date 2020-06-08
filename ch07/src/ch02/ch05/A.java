package ch02.ch05;

//자식 클래스에서
//부모 클래스의 생성자를 선택하여 호출
//super(매개변수) 메소드를 실행
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
		super(10.5);
		System.out.println("B의 default 생성자");
	}

	B(int x) {
		super(x);
		System.out.println("B의 " + x + "가 있는 생성자");
	}
}