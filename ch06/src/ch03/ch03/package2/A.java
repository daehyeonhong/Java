package ch03.ch03.package2;

import ch03.ch03.package1.B;

public class A {
	void f() {
		B b = new B();
		b.n = 3;
		b.g();
	}
}