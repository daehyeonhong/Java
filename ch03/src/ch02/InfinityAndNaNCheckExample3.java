/*package ch02;

import java.util.Scanner;

public class InfinityAndNaNCheckExample3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int x;
		double y;
		char o;
		x = scanner.nextInt();
		
		System.out.println("연산자를 선택해주세요");
		System.out.println("덧셈:+","뺄셈:-","나눗셈:/","곱셈*");

		System.out.println("실수를 입력하세요:");
		y = scanner.nextDouble();

		double z=x%y;
		double result = (int) (x/y);

		if (Double.isNaN(z)) {
			System.out.println("계산 불가");
		} else {
			System.out.println("몫:"+result);
			System.out.println("***계산 과정***");
			System.out.println(x+"÷"+y+"의 나머지는?");
			System.out.println(x+"(은)는"+y+"*"+result+"+"+z);
			System.out.println(x+"÷"+y+"의 몫은:"+result+"나머지는:"+z+"(이)다");
		}
	}
}*/