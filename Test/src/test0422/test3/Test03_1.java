package test0422.test3;

import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2;

		System.out.println("첫 번쨰 숫자를 입력하세요.");
		num1 = scanner.nextDouble();
		try {

			System.out.println("두 번째 숫자를 입력하세요.");
			num2 = scanner.nextDouble();
			if (num2 == 0.0 || num2 == 0) {
				scanner.close();
				throw new Exception();
			}
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));

			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		} catch (Exception e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		scanner.close();
	}
}