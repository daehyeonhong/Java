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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");

			int key = scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("입금할 금액을 입력하세요.");
				num1 = scanner.nextInt();
				balance += num1;
				System.out.println("예금액>" + num1);
				break;
			case 2:
				System.out.println("출금할 금액을 입력하세요.");
				num1 = scanner.nextInt();
				balance -= num1;
				System.out.println("출금액>" + num1);
				break;

			case 3:
				System.out.println("잔고>" + balance);
				break;
			default:
				System.out.println();
				run = !run;
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}