package ch14;

public class Car {
	// �ʵ�
	public String company;
	public String model;
	public int maxSpeed;

	// ������
	public Car() {
	}

	public Car(String company) {
		this.company = company;
	}

	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}

	public Car(String company, String model, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", maxSpeed=" + maxSpeed + "]";
	}

}