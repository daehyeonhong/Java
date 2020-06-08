package ch02;

import java.util.Scanner;

public class InfinityAndNaNCheckExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 100;
		double y;

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
		scanner.close();
	}
}