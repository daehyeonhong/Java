package Exercise0511.Exercise020;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int seq = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌 생성");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		accountArray[seq] = account;
		seq++;
		System.out.println("결과: 계좌가 생성되었습니다.");
		System.out.println(seq);

	}

	// 계좌 목록 보기
	private static void accountList() {
		// 작성 위치
		System.out.println("------");
		System.out.println("계좌 목록");
		System.out.println("------");
		for (int i = 0; i <= seq; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
	}

	// 예금하기
	private static void deposit() {
		// 작성 위치
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				accountArray[i].setBalance(balance);
			}
		}

	}

	// 출금하기
	private static void withdraw() {
		// 작성 위치
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				accountArray[i].setBalance(-balance);
			}
		}
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		return null;

	}
}