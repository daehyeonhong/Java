package ch13;

public class Car2 extends Vehicle {
	// ������-�⺻ ������(default ������)
	Car2() {
		System.out.println("Car2 ������");
	}

	// speed ���� ������
	// private �����ڷ� ���ؼ� ����� �ƴ϶� �߰�
	int speed = 0;

	// �޼ҵ� ������
	void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}

	// �޼ҵ� �߰�
	void fullspeedUp() {
		speed = 5;
	}
}