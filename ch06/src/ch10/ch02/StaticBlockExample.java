package ch10.ch02;

public class StaticBlockExample {
	// �ν��Ͻ� ���
	int field1;

	void method1() {

	}

	// static ���
	static int field2;

	static void method2() {

	}

	// static �ʱ�ȭ ��
	static {
		// field1 = 10;static �ʱ�ȭ �ҷ����� �ν��Ͻ� ����� �� �� ����
		// method1();static �ʱ�ȭ �ҷ����� �ν��Ͻ� ����� �� �� ����
		field2 = 10;
		method2();
	}

	// static �޼ҵ�
	static void method3() {
		// this.feild1 = 10; static ������� �ν��Ͻ��� ����Ű�� this�� �� �� ����
		// this.method1(); static ������� �ν��Ͻ��� ����Ű�� this�� �� �� ����
		field2 = 10;
		method2();
	}
}