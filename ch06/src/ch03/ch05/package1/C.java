package ch03.ch05.package1;

public class C {
	public void k() {
		// 동일 클래스에서 클래스 접근 가능
		B b = new B();

		// 동일 패키지내 멤버 접근 가능
		b.n = 7;
		b.g();
	}
}