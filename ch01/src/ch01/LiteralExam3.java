package ch01;

public class LiteralExam3 {
	public static void main(String[] args) {
		int a = 0x5;// 0x로 시작하는 리터럴은 16진수(hexa)로 간주
		int b = 0xA;
		int c = 0xB3;// 16*B + 3
		int d = 0xAC08;// A*16^3 + C*16^2 + 0*16^1 + 8

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);// 출력시는 10진수로 변환되어서 출력

	}
}