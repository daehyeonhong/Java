package ch06;

public class Calculator {
	int x, y;

	// �Ű� ������ �ް� ���� Ÿ���� �ִ� �޼ҵ�
	int plus(int x, int y) {
		return x + y;
	}

	// �Ű� ������ �ް� ���� Ÿ���� ���� �޼ҵ�
	void minus(int x, int y) {
		System.out.println(x - y);
	}

	// �Ű� ������ ���� �ʰ� ���� Ÿ���� �ִ� �޼ҵ�
	int multiple() {
		return x * y;
	}

	// �Ű� ������ ���� �ʰ� ���� Ÿ�Ե� ���� �޼ҵ�
	void divide() {
		System.out.println(x / y);
	}
}