package ch04.ch03;

public class AnimalMainExample {
	public static void main(String[] args) {
		// 자식 타입의 객체를 참조하는 cat 변수를
		Cat cat = new Cat();
		// 부모 타입의 객체를 참조하는 animal 변수에 대입
		// cat이 참조하는 객체가 부모타입인 Animal로 자동 형변환(promotion)되어 대입
		Animal animal = cat;

		System.out.println(cat == animal ? "동일객체" : "다른객체");

		animal = new Cat();
		System.out.println(cat == animal ? "동일객체" : "다른객체");
	}
}