package ch03.ch02;

public class A {
	void method1() {
		System.out.println("A�� method1");
	}
}

class B extends A {
	@Override // �����Ϸ����� �����ǵ� �޼ҵ����� �˸�
	void method1() {// ������ ����: �θ� �޼ҵ�� ����� �ñ״��İ� ���ƾ� ��.
		System.out.println("B�� method1");
	}
}