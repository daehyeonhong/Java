package ch01;

import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean isRun = true;
		char grade;
		System.out.println("������ �Է��ϼ���.(0~100):");
		int score = scanner.nextInt();
		while (isRun) {
			System.out.println();
			score = scanner.nextInt();

			if (score>100||score<0) {

			}
			switch (score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
			}
			System.out.println("������ "+grade+"�Դϴ�.");
			scanner.close();
		}
	}
}
