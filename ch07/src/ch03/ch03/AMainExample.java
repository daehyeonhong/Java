package ch03.ch03;

public class AMainExample {
	public static void main(String[] args) {
		B b = new B();
		b.method1(10, 20);

		b.method1(1.0, 2.3);
		System.out.println(b.method1(14.32, 10));
	}
}