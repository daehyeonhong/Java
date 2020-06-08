package ch03.ch03.package1;

public class C {
	public void k() { // 동일 패키지 클래스 접근 가능
		B b = new B();// 동일 패키지 멤버(필드) 접근 가능
		b.n = 7;// 동일 패키지 멤버(메소드) 접근 가능
		b.g();
	}
}