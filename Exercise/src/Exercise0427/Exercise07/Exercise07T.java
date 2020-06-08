package Exercise0427.Exercise07;

//7 while문과 Scanner 이용 예금, 출금, 잔고 조회 및 종료
import java.util.Scanner;

public class Exercise07T {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;// 잔고 초기화

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				int amount = scanner.nextInt();
				if (balance - amount < 0) {
					System.out.println("출금액이 잔고보다 많습니다.");
					continue;
				}
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;

			default:
				run = false;
				break;
			}
		}

		System.out.println("프로그램 종료");

		scanner.close();
	}
}