package test0422.test3;

import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2;

		System.out.println("ù ���� ���ڸ� �Է��ϼ���.");
		num1 = scanner.nextDouble();
		try {

			System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
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
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		scanner.close();
	}
}