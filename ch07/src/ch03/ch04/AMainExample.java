package ch03.ch04;

public class AMainExample {
	public static void main(String[] args) {
		B b = new B();
		b.method1(5, 6);
		b.method2(6, 9);
		b.method2(7, 3);

		C c = new C();
		c.method2(10, 20);
		c.method1(10, 40);

	}
}