package Exercise0514;

import java.util.Scanner;

public class BankApplicationTT {

	// run 변수를 추가로 선언했습니다.
	// 입력된 계좌번호와 비밀번호의 맞고 틀림에 따라 true, false가 각각 저장되고
	// 이체, 비밀번호변경, 탈퇴 메소드 실행시 새로 추가된 while문이나 if문을 실행할 것 입니다.
	public static boolean run = false;

	private static final int ANO_NO = 111;
	private static int seq;
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.이체 | 6.비밀번호 변경 | 7.탈퇴 | 8.종료");
			System.out.println("------------------------------------------------------------------------");
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
			case 5:
				transfer();
				break;
			case 6:
				changePassword();
				break; // 비밀번호를 변경하는 메소드 추가
			case 7:
				secession();
				break;
			default:
				run = false;
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

		// 비밀번호를 입력받아 password 변수에 저장
		System.out.print("비밀번호 입력 : ");
		String password = scanner.next();
		System.out.print("비밀번호 확인 : ");// pwdCheck=>비교하려는 값이 아직 Account객체에 입력X
		String agianPassword = scanner.next();
		if (!(password.equals(agianPassword))) {
			System.out.println("비밀번호를 확인하세요");
		} else {
			System.out.print("초기 입금액: ");
			int balance = scanner.nextInt();
			Account account = new Account(ANO_NO + "-" + (++seq) + seq + seq, owner, balance, password);
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] == null) {
					accountArray[i] = account;
					break;
				}
			}
			System.out.println("결과: 계좌가 생성되었습니다.");
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

		// 비밀번호를 입력받는 부분 추가
		System.out.print("비밀번호 입력 : ");
		String password = scanner.next();

		pwdCheck(ano, password);

		if (run == true) {
			System.out.print("출금액: ");

			int balance = scanner.nextInt();
			Account account = findAccount(ano);
			account.setBalance(-balance);
			System.out.println("결과:출금이 성공되었습니다.");
		}
	}

	// 이체 메소드
	private static void transfer() {
		System.out.println("--------");
		System.out.println("이체");
		System.out.println("--------");
		System.out.print("출금할 계좌 번호> ");
		String ano1 = scanner.next();
		Account account1 = findAccount(ano1);

		// 비밀번호를 입력받는 부분 추가
		System.out.print("비밀번호 입력 : ");
		String password = scanner.next();

		// 입력된 값들이 서로 같은 객체를 참조하고 있는지를 확인합니다.
		// 서로 맞다면 run 변수는 true 값을 갖고 아래의 if 문을 실행하게 됩니다.
		pwdCheck(ano1, password);

		if (run == true) {
			System.out.print("상대 계좌 번호> ");
			String ano2 = scanner.next();
			Account account2 = findAccount(ano2);
			System.out.print("이체 금액> ");
			int balance = scanner.nextInt();
			account1.setBalance(-balance);
			account2.setBalance(balance);
			System.out.println("결과: 이체가 성공되었습니다.");
		} // if

	}

	// 비밀번호 변경 메소드
	private static void changePassword() {
		System.out.println("----------");
		System.out.println("비밀번호 변경");
		System.out.println("----------");

		System.out.print("변경할 비밀번호의 계좌번호 입력 > ");
		String ano = scanner.next();

		System.out.print("현재 비밀번호 입력 : ");
		String password = scanner.next();

		// 입력된 값들이 서로 같은 객체를 참조하고 있는지를 확인합니다.
		// 서로 맞다면 run 변수는 true 값을 갖고 아래의 while 문을 실행하게 됩니다.
		pwdCheck(ano, password);

		// 새 비밀번호를 적고 그걸 제대로 입력할 때 까지 반복하는 while문 입니다.
		while (run) {
			System.out.print("새 비밀번호 입력 : ");
			String newPassword = scanner.next();

			System.out.print("새 비밀번호 확인을 위해 다시 입력해주세요 : ");
			String againPassword = scanner.next();

			// 입력된 새 비밀번호가 맞게 입력되었는지 확인합니다.
			if (againPassword.equals(newPassword)) {
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i].getAno().equals(ano)) {
						accountArray[i].setPassword(againPassword);
						System.out.println("비밀번호 변경이 완료 되었습니다.");
						run = false; // while문 종료
						break; // for문 빠져나가기
					}
				}
			} else
				System.out.println("새 비밀번호가 맞지 않습니다.");

		} // while
	}

	// 탈퇴 메소드
	private static void secession() {
		System.out.println("--------");
		System.out.println("회원 탈퇴");
		System.out.println("--------");
		System.out.print("탈퇴 할 계좌 번호> ");
		String ano = scanner.next();

		System.out.print("비밀번호 입력 : ");
		String password = scanner.next();
		pwdCheck(ano, password);

		// pwdCheck 메소드에서 ano와 password가 서로 동일한 객체를 참조해야지 if문이 실행 될 수 있습니다.
		if (run == true) {
			System.out.print("정말 탈퇴하시겠습니까?(y/n)");
			char yesNo = scanner.next().charAt(0);
			if (yesNo == 'y') {
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i].getAno().equals(ano)) {
						accountArray[i] = null;
						System.out.println("탈퇴가 완료되었습니다.");
						break;
					}
				} // for
			} // yesNo를 묻는 if
		} // run을 묻는 if
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

	// 비밀번호 확인 메소드
	private static void pwdCheck(String ano, String password) {
		for (int i = 0; i < accountArray.length; i++) {// 배열객체를 모두 소환해서
			if (accountArray[i].getAno().equals(ano)) {// 그 중 입력된 계좌번호가 같은 객체를 찾고
				if (accountArray[i].getPassword().equals(password)) {
					// 입력된 비밀번호와 그 객체의 비밀번호가 같은지 확인 한 다음
					// 같다면 ~break; 까지를 실행하고 해당 메소드는 종료됩니다.
					run = true;
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					run = false;
					break;
				}
			} // for 밑 if
		} // for
	}

}// class 끝