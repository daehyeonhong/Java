package ch13.ch06.package1;

//동일 패키지
public class C {
	public void k() {
		// 접근 가능
		B b = new B();
		// 동일 패키지내에서 접근 가능
		b.n = 7;
		b.g();
	}
}