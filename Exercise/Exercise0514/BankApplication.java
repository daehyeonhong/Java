package Test0514.Bank;

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
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.이체 | 6.탈퇴 | 7.비밀 번호 변경 | 8.종료");
			System.out.println("----------------------------------------------------------");
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
				secession();
				break;
			case 7:
				changePassword();
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
		boolean isRun = true;
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		while (isRun) {
			if (balance < 0) {
				System.out.println("초기 입금액을 확인 후 다시 입력하세요.");
				System.out.print("초기 입금액: ");
				balance = scanner.nextInt();
			} else {
				System.out.print("설정하려는 비밀번호를 입력하세요: ");
				String password = scanner.next();
				if (mkPw(password)) {
					Account account = new Account(ANO_NO + "-" + (++seq) + seq + seq, owner, balance, password);
					for (int i = 0; i < accountArray.length; i++) {
						if (accountArray[i] == null) {
							accountArray[i] = account;
							System.out.println("결과: 계좌가 생성되었습니다.");
							isRun = !isRun;
							break;
						}
					}
				} else {
					System.out.println("계좌 생성에 실패했습니다. 다시 시도하세요.");
					break;
				}
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
		try {
			System.out.println("--------");
			System.out.println("예금");
			System.out.println("--------");
			System.out.print("계좌 번호:");
			String ano = scanner.next();
			boolean isRun = true;
			while (isRun) {
				System.out.print("예금액: ");
				int balance = scanner.nextInt();
				if (balance < 0) {
					System.out.println("예금액을 확인하고 다시 입력하세요.");
				} else {
					Account account = findAccount(ano);
					account.setBalance(balance);
					System.out.println("결과:예금이 성공되었습니다.");
					isRun = !isRun;
				}
			}
		} catch (Exception e) {
			System.out.println("계좌 번호를 확인하세요.");
		}
	}

	// 출금하기
	private static void withdraw() {
		/*
		 * System.out.println("--------"); System.out.println("출금");
		 * System.out.println("--------"); System.out.print("계좌 번호:"); String ano =
		 * scanner.next(); System.out.print("출금액: "); int balance = scanner.nextInt();
		 * Account account = findAccount(ano); account.setBalance(-balance);
		 * System.out.println("결과:출금이 성공되었습니다.");
		 */
		try {
			System.out.println("--------");
			System.out.println("출금");
			System.out.println("--------");
			System.out.print("계좌 번호:");
			String ano = scanner.next();
			Account account = findAccount(ano);
			for (int i = 0; i < 3; i++) {
				System.out.println();
			}
			System.out.println("잔고: " + account.getBalance());
			boolean isRun = true;
			while (isRun) {
				System.out.print("출금액: ");
				int balance = scanner.nextInt();
				if ((balance < 0) || (account.getBalance() < balance)) {
					System.out.println("출금액을 확인하고 다시 입력하세요.");
				} else {
					account.setBalance(-balance);
					System.out.println("결과: 출금이 성공되었습니다.");
					isRun = !isRun;
				}
			}
		} catch (Exception e) {
			System.out.println("계좌 번호를 확인하세요.");
		}
	}

	private static void transfer() {
		try {
			System.out.print("출금 계좌 번호: ");
			String ano1 = scanner.next();
			System.out.print("상대 계좌 번호: ");
			String ano2 = scanner.next();
			Account account2 = findAccount(ano2);
			Account account1 = findAccount(ano1);
			System.out.println("잔고: " + account1.getBalance());
			boolean isRun = true;
			if (account1 != null & account2 != null) {
				while (isRun) {
					System.out.print("이체액: ");
					int balance = scanner.nextInt();
					if ((balance < 0) || (account1.getBalance() < balance)) {
						System.out.println("이체 금액을 확인하고 다시 입력하세요.");
					} else {
						account1.setBalance(-balance);
						account2.setBalance(balance);
						System.out.println("결과: 이체가 성공되었습니다.");
						isRun = !isRun;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("계좌 번호를 확인하세요.");
		}

	}

	private static void changePassword() {
		try {
			System.out.print("계좌 번호: ");
			String ano = scanner.next();
			if (!(changePassword(ano).equals(null))) {
				findAccount(ano).setPassword(changePassword(ano));
				System.out.println("결과: 비밀 번호 변경 성공.");
			} else {
				System.out.println("결과: 비밀 번호 변경 실패.");
			}
		} catch (Exception e) {
			System.out.println("계좌를 확인하세요.");
		}
	}

	private static void secession() {
		try {
			System.out.println("--------");
			System.out.println("회원 탈퇴");
			System.out.println("--------");
			System.out.print("탈퇴 할 계좌 번호> ");
			String ano = scanner.next();
			System.out.print("정말 탈퇴하시겠습니까?(y/n)");
			char yesNo = scanner.next().charAt(0);
			if (yesNo == 'y' | yesNo == 'Y') {
				for (int i = 0; i < accountArray.length; i++) {
					if (accountArray[i] != null) {
						if (accountArray[i].getAno().equals(ano)) {
							accountArray[i] = null;
							System.out.println("탈퇴가 완료되었습니다.");
							break;
						}
					}
				}
			} else {
				System.out.println("탈퇴 요청이 취소되었습니다.");
			}
		} catch (Exception e) {
			System.out.println("계좌 번호를 확인하세요.");
		}
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

	private static boolean mkPw(String password) {
		boolean isRun = false;
		int[] reTry = new int[3];
		for (int i = 0; i < reTry.length; i++) {
			System.out.print("비밀번호 확인: ");
			String passwordC = scanner.next();
			if (password.equals(passwordC)) {
				isRun = true;
				break;
			} else if (i < (reTry.length - 1)) {
				System.out.println((reTry.length - (i + 1)) + "회 남았습니다.\n확인 후 다시 입력하세요.");
			}
		}
		return isRun;
	}

	private static boolean checkPassword(Account account) {
		boolean isRun = false;
		System.out.println("비밀번호를 입력하세요.");
		String password = scanner.next();
		int[] reTry = new int[3];
		for (int i = 0; i < reTry.length; i++) {
			if (account.getPassword().equals(password)) {
				isRun = true;
				break;
			} else if (i < (reTry.length - 1)) {
				System.out.println((reTry.length - (i + 1)) + "회 남았습니다.\n확인 후 다시 입력하세요.");
			}
		}
		return isRun;
	}

	private static String changePassword(String ano) {
		String newPassword = null;
		if (!(findAccount(ano).equals(null))) {
			System.out.println();
			if (checkPassword(findAccount(ano))) {
				System.out.print("변경할 비밀 번호를 입력하세요: ");
				newPassword = scanner.next();
				System.out.print("비밀번호 확인");
				String checkPassword = scanner.next();
				if (newPassword.equals(checkPassword)) {
					return newPassword;
				} else {
					newPassword = null;
				}
			}
		}
		return newPassword;
	}
}