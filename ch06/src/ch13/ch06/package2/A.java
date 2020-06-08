package ch13.ch06.package2;

import ch13.ch06.package1.B;

public class A {
	void f() {
		// B 클래스가 public이므로 접근 가능
		B b = new B();

		// 멤버가 protected이므로 다른 패키지에서 접근 불가
		// b.n = 3;
		// b.g();
	}
}