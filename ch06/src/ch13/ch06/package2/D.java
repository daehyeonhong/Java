package ch13.ch06.package2;

import ch13.ch06.package1.B;

//상속 관계의 자식 클래스는
//다른 패키지에 속해 있어도
//B클래스의 protected 접근 제한자로
//선언된 멤버에 접근 가능
public class D extends B {
	void f() {
		n = 3;
		g();
	}
}