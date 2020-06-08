package ch05.ch01;

public class AMainExample {
	public static void main(String[] args) {
		// 자식 /자손 클래스의 객체는 부모/조상의 참조 변수에 대입 가능
		A a1 = new A();// promotion
		A a2 = new B();// promotion
		A a3 = new C();// promotion
		A a4 = new D();// promotion

		// 자식 클래스의 객체는 부모의 참조 변수에 대입 가능
		B b = new D();// promotion
		C c = new E();// promotion

		// 조상이 같아도 서로 다른 부모의 객체 참조 변수에 자식 객체 대입 불가능
		// B b2 = new E();
		// C c2 = new D();

		// B is a A: true
		// A is a B: false
		B b3 = (B) a2; // 처음 B객체 였다가 promotion이 돼서 A(부모)타입으로 변환 후 다시 원래 타입으로 환원
		// B b4 = (B) a1; // 처음 A(부모)타입으로 생성 되어서 B(자식 타입)에 대입 불가
		// B b4 = (B) new A();

		// 서로 다른 자식 클래스는 부모 타입으로 promotion 됐다가
		// 서로 다른 자식 클래스로 casting은 불가능함.
		B b5 = new B();
		A a5 = b5;
		// C c5 = (C) a5;
	}
}