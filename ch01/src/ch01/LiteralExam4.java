package ch01;
//실수 리터럴
public class LiteralExam4 {
	
	public static void main(String[] args) {
	//소수점이 있는 리터럴은 10진수 실수로 간주
		double x = 0.25;
		double y = -3.14;
		y = 10.25;
		y = 10;//실수타입변수에 정수값을 입력하면 정수 리터럴이 실수타입으로 변환(형 변환)
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		y = 25;
		
		System.out.println("y="+y);
	}
}
