package ch05.ch02;

public class A {
	private int a;// ��� ���� - �ڽ� Ŭ�������� ���� �Ұ���
	int b;// ��� ���� - �ڽ� Ŭ�������� ���� ����

	private void method1() {// ��� ����
		a = 10;
		System.out.println(a);
	}

	public void method2() {// ��� ����
		method1();
	}
}

class B extends A{
	
}