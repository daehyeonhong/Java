package ch08.ch01;

public class MainExample {
	public static void main(String[] args) {
		// 부모 타입으로 promotion
		MyInterface mi = new MyClass();
		// = new MyInterface()
		mi.method1();
	}
}