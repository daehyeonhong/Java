package ch02.ch02;

//상속 받은 자식 클래스에서 부모클래스의 생성자 호출시
//자식 생성자에 super() 메소드를 별도로 선언하지 않은 경우
//부모 클래스의 기본 생성자를 호출
public class A {
	A() {
		System.out.println("생성자A");
	}

	A(int x) {
		System.out.println("x가 있는 생성자A");
	}
}

class B extends A {
	B() {
		super(0);
		System.out.println("생성자B");
	}
}