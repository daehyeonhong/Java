package ch08;

public class Car {
	// �ν��Ͻ�(non-static)���(�ν��Ͻ�, ����, new)
	int year;
	String model;
	int no;

	// static���(����, ����ũ, �ε�)
	static int seq;

	public Car(int year, String model) {
		no = ++seq;
		this.year = year;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [" + "��" + model + "���������ȣ:H" + year + no + "]";
	}

}