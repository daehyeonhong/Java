package Exercise0427.Exercise07;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.���� | 2. ��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.print("����> ");

			balance = scanner.nextInt();
			switch (balance) {
			case 1:
				System.out.println("���ݾ�>10000\n");
				break;
			case 2:
				System.out.println("��ݾ�>2000\n");
				break;
			case 3:

				System.out.println("�ܰ�>8000\n");
				break;
			default:
				System.out.println();
				run = !run;
				break;
			}
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}
}