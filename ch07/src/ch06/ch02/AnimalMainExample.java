package ch06.ch02;

public class AnimalMainExample {
	public static void main(String[] args) {
		Animal animal = new Bird();
		animal.fly();
		animal.stop();
		
		animal = new Insect();
		animal.fly();
		animal.stop();
		
		animal = new Fish();
		animal.fly();
		animal.stop();
	}
}