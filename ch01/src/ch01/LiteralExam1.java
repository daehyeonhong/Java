package ch01;
//정수 리터럴
public class LiteralExam1 {
	public static void main(String[] args) {
		int x = 0;//소수점이 없는 정수리터럴은 10진수로 간주
		int y = 75;
		int z = -100;
		
		long a = 0b111111111000000000000101l;//2진수 리터럴
		int b = 0b0101;
		
		long l = 24l;//long타입(64bit)길이의 정수 타입 변수
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("l="+l);
	}
}
