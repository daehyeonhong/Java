package ch08.ch01;

//�������̽�
//�޼ҵ� �԰��� �߻�ȭ �Ͽ� ���� ���� ��ü
public interface MyInterface {
	// ���
	double PI = 3.141592;// public static final�� ����

	// �߻� �޼ҵ�
	void method1();// public abstract�� ���� ��
}

class MyClass implements MyInterface {

	@Override
	public void method1() {
		System.out.println("method");
	}
}