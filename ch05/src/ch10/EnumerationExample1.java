package ch10;

public class EnumerationExample1 {
	public static void main(String[] args) {
		// 열거타입 변수 선언
		Week today;
		// 열거타입 변수에 열거 상수 값 지정
		today = Week.MONDAY;
		
		System.out.println(today);
	}
}