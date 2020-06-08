package ch06.ch02;

public class ValuePassingExample2 {
	public static void main(String[] args) {
		// 객체 생성
		Circle pizza = new Circle(10);

		// 메소드 매개값으로 참조 값이 전달 됨.
		increase(pizza);
		System.out.println("pizzaRadius: " + pizza.radius);
	}

	// 참조 타입 매개 값을 받고 리턴을 하지 않는 메소드
	static void increase(Circle c) {
		c.radius++;
		System.out.println("radius: " + c.radius);
	}
}