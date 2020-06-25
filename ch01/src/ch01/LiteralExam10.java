package ch01;

public class LiteralExam10 {
	public static void main(String[] args) {
		int a = 02;// 리터럴이 0으로 시작하면 8진수(octa)로 간주
		int b = -04;
		int c = 015;// 8*1+5 = 13;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);// 출력값은 10진수로 출력
	}
}
