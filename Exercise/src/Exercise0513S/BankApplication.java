package Exercise0513S;

import java.util.Scanner;

public class BankApplication {
	private static final int ANO_NO = 111;
	private static int seq;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.이체 | 6.탈퇴 | 7.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:createAccount();break;
			case 2:accountList();break;
			case 3:deposit();break;
			case 4:withdraw();break;
			case 5:transfer();break;
			case 6:secession();break;
			default:run = false;
			}
		} // while문 끝.
		System.out.println("프로그램 종료");
		scanner.close();
	}// 메인 메소드 끝.

	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌 생성");
		System.out.println("--------");
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		Account account = new Account(ANO_NO + "-" + (++seq) + seq + seq, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
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
		System.out.print("예금액: ");
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

	private static void transfer() {
		System.out.print("출금 계좌 번호> ");
		String ano1 = scanner.next();
		Account account1 = findAccount(ano1);
		System.out.print("상대 계좌 번호> ");
		String ano2 = scanner.next();
		Account account2 = findAccount(ano2);
		System.out.print("이체 금액> ");
		int balance = scanner.nextInt();
		account1.setBalance(-balance);
		account2.setBalance(balance);
		System.out.println("결과: 이체가 성공되었습니다.");

	}

	private static void secession() {
		System.out.println("--------");
		System.out.println("회원 탈퇴");
		System.out.println("--------");
		System.out.print("탈퇴 할 계좌 번호> ");
		String ano = scanner.next();
		System.out.print("정말 탈퇴하시겠습니까?(y/n)");
		char yesNo = scanner.next().charAt(0);
		if (yesNo == 'y') {
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i].getAno().equals(ano)) {
						accountArray[i] = null;
						System.out.println("탈퇴가 완료되었습니다.");
						break;
				}
			}
		}
	}

	// Account[]에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			
				if (accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				
			}
		}
		return account;
	}
}