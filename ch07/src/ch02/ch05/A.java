package ch02.ch05;

//�ڽ� Ŭ��������
//�θ� Ŭ������ �����ڸ� �����Ͽ� ȣ��
//super(�Ű�����) �޼ҵ带 ����
public class A {
	A() {
		System.out.println("A�� default ������");
	}

	A(int x) {
		System.out.println("A�� " + x + "�� �ִ� ������");
	}

	A(double x) {
		System.out.println("A�� " + x + "�� �ִ� ������");
	}
}

class B extends A {
	B() {
		super(10.5);
		System.out.println("B�� default ������");
	}

	B(int x) {
		super(x);
		System.out.println("B�� " + x + "�� �ִ� ������");
	}
}