package ch04;

public class Car {
	Handle handle = new Handle();
	Engine engine = new Engine();
	// Ŭ������ �ʵ�(�Ӽ�, ����, ��)�� ������
	// �ʵ� ���� ������ �θ� ��ü�� �ƴ� ��� ���� �ڽ� ��ü�� ���� ������ ����
	Tire LeftFrontTire = new KeumhoTire();
	Tire LeftRearTire = new Tire();
	Tire RightFrontTire = new Tire();
	Tire RightRearTire = new HankookTire();
}