package ch03.ch05.package2;

import ch03.ch03.package1.B;

public class A {
	void f() {
		// 클래스 public 접근 가능
		B b = new B();
		// 멤버는 default 접근 불가
		// b.n =3;
		// b.g();

	}
}