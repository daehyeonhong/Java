package ch13.ch06.package2;

import ch13.ch06.package1.B;

public class A {
	void f() {
		// B Ŭ������ public�̹Ƿ� ���� ����
		B b = new B();

		// ����� protected�̹Ƿ� �ٸ� ��Ű������ ���� �Ұ�
		// b.n = 3;
		// b.g();
	}
}