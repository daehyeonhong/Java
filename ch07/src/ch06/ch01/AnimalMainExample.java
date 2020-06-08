package ch06.ch01;

public class AnimalMainExample {
	public static void main(String[] args) {
		// 실체를 만들 수 없는 클래스 = 추상 클래스
		// Animal animal = new Animal();
		Animal animal = new Cat();
		animal = new Dog();

		animal.field1 = 3;
		animal.fi();
	}
}