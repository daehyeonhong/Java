package ch01;

public class Calculator {
	// ������� �����ϴ� �Ӽ�(field)
	static int result;

	// ��� ���
	static int add(int num1, int num2) {
		result = num1 + num2;
		return result;
	}
}