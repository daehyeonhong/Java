package Class.R0507;

//this() Ŭ���� ���� ������ ȣ�� �޼ҵ�
//���ǻ���-this() �޼ҵ�� �������� ù ���ο� ����ؾ���.
public class A {
	A() {
		this("hello", "hi", 20);
		System.out.println("�Ű����� ���� default ������");
	}

	A(String s) {
		System.out.println("�Ű����� 1��¥�� ������ ȣ��");
	}

	A(String s, String s2) {
		this(s);
		System.out.println("�Ű����� 2��¥�� ������ ȣ��");
	}

	A(String s, String s2, int i) {
		this(s, s2);
		System.out.println("�Ű����� 3��¥�� ������ ȣ��");
	}
}