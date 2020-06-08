package ch05.ch04;

public class CarMainExample {
	public static void main(String[] args) {
		Car car = new Car(new Tire(), new KumhoTire(), new HankookTire(), new HankookTire());
		car.setTire1(new HankookTire());// Tire tire = new HankookTire();
	}
}