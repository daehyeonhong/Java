package ch01;

//Mechanic�� ��� ���� Car Ŭ����
public class Car extends Mechanic {
	// �Ӽ�
	Engine engine;
	Tire LeftFrontTire;
	Tire LeftRearTire;
	Tire RightFrontTire;
	Tire RightRearTire;
	Handle handle;

	// ������-default������
	Car() {
		engine = new Engine();
		LeftFrontTire = new Tire();
		LeftRearTire = new Tire();
		RightFrontTire = new Tire();
		RightRearTire = new Tire();
		handle = new Handle();
	}
}