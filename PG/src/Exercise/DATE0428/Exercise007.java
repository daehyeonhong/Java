package Exercise.DATE0428;

import java.util.Scanner;

public class Exercise007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		int balance = 0;
		int num1 = 0;

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����>");

			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
				num1 = scanner.nextInt();
				balance += num1;
				System.out.println("���ݾ�>" + num1);
				break;
			case 2:
				System.out.println("����� �ݾ��� �Է��ϼ���.");
				num1 = scanner.nextInt();
				balance -= num1;
				System.out.println("��ݾ�>" + num1);
				break;

			case 3:
				System.out.println("�ܰ�>" + balance);
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