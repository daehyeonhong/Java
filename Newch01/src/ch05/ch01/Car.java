package ch05.ch01;

public class Car {
	private String model;
	private int year;

	Car() {

	}

	// default 생성자는 안 만들어짐
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + "]";
	}

}