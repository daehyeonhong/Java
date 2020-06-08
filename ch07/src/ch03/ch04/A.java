package ch03.ch04;

public class A {
	void method1(int x, int y) {
		System.out.println("A: " + (x + y));
	}
}

class B extends A {
	// ������ �� �޼ҵ�
	void method1(int x, int y) {
		System.out.println("B: " + (x + y));
	}

	// method1�� ȣ���ϴ� �޼ҵ�
	// this.method:�ڽ��� Ŭ������ �ٸ� �޼ҵ� ȣ��
	// super.method: �θ��� ������ ������ �޼ҵ� ȣ��
	void method2(int x, int y) {
		if (x > y) {
			this.method1(x, y);
		} else {
			super.method1(x, y);
		}
	}
}

class C extends B {
	void method2(int x, int y) {
		super.method2(x, y);// �θ� Ŭ������ �޼ҵ� ȣ��
	}

	void method1(int x, int y) {
		super.method1(x, y);// �θ� Ŭ������ �޼ҵ� ȣ��
	}
}