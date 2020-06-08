package ch08;

public class CarMainExample {
	public static void main(String[] args) {
		Car car1 = new Car(2002, "SONATA");
		Car car2 = new Car(2002, "SONATA2");
		Car car3 = new Car(2002, "SONATA3");

		Car[] cars = { car1, car2, car3 };

		cars[1] = null;

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i] == null ? "" : cars[i].toString());
		}
	}
}