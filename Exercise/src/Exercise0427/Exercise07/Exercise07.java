package Exercise0427.Exercise07;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");

			balance = scanner.nextInt();
			switch (balance) {
			case 1:
				System.out.println("예금액>10000\n");
				break;
			case 2:
				System.out.println("출금액>2000\n");
				break;
			case 3:

				System.out.println("잔고>8000\n");
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