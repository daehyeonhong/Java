package ch06;

public class InstaceOfExample {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		method1(c1);
		Child2 c2 = new Child2();
		method1(c2);
	}

	static void method1(Parent parent) {
		if (parent instanceof Child1) {
			Child1 ch1 = (Child1) parent;
			System.out.println("ch1");
		}
	}
}