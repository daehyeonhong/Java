package ch01;

public class Person {
	String name;
	int age;
	Calculator calculator;

	// ������ Ŭ������� ���� �޼ҵ�����
	// ������ ��ü�� �ʵ尪 �ʱ�ȭ �ϴ� ����
	Person() {
		name = "ȫ�浿";
		age = 13;
		calculator = new Calculator();
	}

	public void getResult() {
		System.out.println(Calculator.add(10, 20));
	}
}