package Exercise0511.Exercise020T;

import java.util.Scanner;

public class BankApplication {
	private static final int ANO_NO = 111;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			default:
				run = false;
			}
		} // while문 끝.
		System.out.println("프로그램 종료");
	}// 메인 메소드 끝.

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌 생성");
		System.out.println("--------");
		System.out.print("계좌 번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		Account account = new Account(ANO_NO + "-" + ano, owner, balance);
		// System.out.println(account);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
	}

	// 계좌 목록 보기
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌 목록");
		System.out.println("--------");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i]);
			}
		}
	}

	// 예금하기
	private static void deposit() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌 번호:");
		String ano = scanner.next();
		System.out.print("입금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		account.setBalance(balance);
		System.out.println("결과:예금이 성공되었습니다.");

	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌 번호:");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		account.setBalance(-balance);
		System.out.println("결과:출금이 성공되었습니다.");
	}

	// Account[]에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}