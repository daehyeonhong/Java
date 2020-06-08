package ch05.ch01;

public class CarMainExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setModel("AVANTE");
		car1.setYear(2020);
		System.out.println(car1);
		Car car2 = new Car("SONATA", 2020);
		System.out.println(car2);
	}
}