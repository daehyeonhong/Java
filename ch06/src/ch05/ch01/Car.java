package ch05.ch01;

public class Car {
	// �ʵ�
	// �����Ӽ�
	String company = "����";// ������
	String model = "SONATA";// ��
	String color = "Red";// ����
	int maxSpeed = 220;// �ְ� �ӵ�
	int year = 2020;// ��������

	// ���� ����
	int speed;// ���� �ӵ� 0���� �ʱ�ȭ ��.
	int rpm;// ���� rpm 0���� �ʱ�ȭ ��.
	boolean isStop;//���� �������� ���� false�� �ʱ�ȭ ��.

	// ��ǰ
	Body body = new Body();
	Engine engine = null;
	Tire tire;//null�� �ʱ�ȭ ��.

	// ������
	// �޼ҵ�
	void run() {
		int count = 0;
		count++;
		speed++;
	}
}

class Body {

}

class Engine {

}

class Tire {

}