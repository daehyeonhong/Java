package ch05.ch01;

//Ŭ������ ���(�ʵ�, ������, �޼ҵ�)
public class Person {
	// �ʵ�
	String name;
	int year;
	Car car;

	// ������
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public Person(String name, int year, Car car) {
		this.name = name;
		this.year = year;
		this.car = car;
	}

	// �޼ҵ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", year=" + year + ", car=" + car + "]";
	}

}