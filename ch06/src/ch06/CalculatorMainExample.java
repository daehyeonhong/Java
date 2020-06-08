package ch06;

public class CalculatorMainExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.x = 10;
		c.y = 20;

		// 매개 변수를 받고 리턴 타입이 있는 메소드 호출
		int result = c.plus(10, 30);// 참조변수.메소드(값1,값2);
		System.out.println(result);

		// 매개 변수를 받고 리턴 타입이 없는 메소드 호출
		c.minus(20, 50);
		
		// 매개 변수를 받지 않고 리턴 타입만 있는 메소드 호출
		result = c.multiple();
		System.out.println(result);
		
		// 매개 변수도 받지 않고 리턴 타입도 없는 메소드 호출
		c.divide();
	}
}