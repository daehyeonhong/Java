package ch05.ch04;

//���� ����
//��ǰ ��ü�� ��ü�ϴ��� ��ǰ�� ����ϴ� Ŭ����(CarŬ����)��
//������ ��ġ�� ����
//��ü�� �������� ���� - ���α׷� ������.
public class Car {
	Tire tire1 = new HankookTire();
	Tire tire2;
	Tire tire3;
	Tire tire4;

	// ������ -constructor ������
	public Car(Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
		this.tire1 = tire1;
		this.tire2 = tire2;
		this.tire3 = tire3;
		this.tire4 = tire4;
	}

	// set �޼ҵ� -set������
	public void setTire1(Tire tire1) {
		this.tire1 = tire1;
	}

	public void setTire2(Tire tire2) {
		this.tire2 = tire2;
	}

	public void setTire3(Tire tire3) {
		this.tire3 = tire3;
	}

	public void setTire4(Tire tire4) {
		this.tire4 = tire4;
	}
}

class Tire {
}

class HankookTire extends Tire {

}

class KumhoTire extends Tire {

}