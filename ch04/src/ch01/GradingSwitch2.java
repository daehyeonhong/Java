package ch01;

import java.util.Scanner;

public class GradingSwitch2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���.(0~100):");
		int score = scanner.nextInt();

		switch (score/10) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("�հ�");
			break;
		default:
			System.out.println("���հ�");
		}
		scanner.close();
	}
}

