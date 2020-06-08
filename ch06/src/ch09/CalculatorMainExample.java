package ch09;

public class CalculatorMainExample {
	public static void main(String[] args) {

		// static 멤버는
		// 클래스명.멤버명으로 접근
		int result = Calculator.plus(10, 20);
		System.out.println(result);
		
		result = Calculator.minus(20, 25);
		System.out.println(result);
		
		result = Calculator.abs(20, 25);
		System.out.println(result);
		
		System.out.println(10 * 10 * Calculator.PI);
	}
}