package ch13;

public class Vehicle {
	// ������-�⺻ ������(default ������)
	Vehicle() {
		System.out.println("Vehicle��ü ������");
	}

	// �Ӽ�
	private int speed;

	// ���
	void run() {
		System.out.println("�޸���.");
	}

	void stop() {
		System.out.println("�����Ѵ�.");
	}

	void speedUp() {

		if (++speed > 5) {
			speed = 5;
		}
		// speed++;
	}

	void speedDown() {
		if (--speed < 0) {
			speed = 0;
		}
	}

	void getSpeed() {
		System.out.println(speed);
	}
}