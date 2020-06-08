package Bank.mk2;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.이체 | 6.비밀번호 변경 | 7.탈퇴 | 8.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			try {
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

			} catch (Exception e) {
				break;
			} // while문 끝.
			System.out.println("프로그램 종료");
			scanner.close();
		}
	}// 메인 메소드 끝.

	// 계좌 생성하기
	private static void createAccount() {
		if (!(checkArray() == accountArray.length)) {
			System.out.println("--------");
			System.out.println("계좌 생성");
			System.out.println("--------");
			System.out.print("계좌주: ");
			String owner = scanner.next();
			System.out.print("설정하려는 비밀번호를 입력하세요.");
			String password = scanner.next();
			if (setPassword(password) == null) {
				System.out.println("비밀번호 확인 후 다시 시도하세요.");
			} else {
				for (int i = (int) (Math.random() * accountArray.length); i < accountArray.length;) {
					if (accountArray[i] == null) {
						System.out.print("초기 입금액을 입력하세요: ");
						int balance = scanner.nextInt();
						if (balance < 0) {
							System.out.println("초기 입금액을 확인 후 다시 시도하세요.");
						} else {
							String ano = makeAno();
							if (ano != null) {
								accountArray[i] = new Account(ano, owner, balance, password);
								System.out.println(accountArray[i].getOwner() + "님 계좌가 생성되었습니다.\n계좌번호는 "
										+ accountArray[i].getAno());
								break;
							}
						}
					}
				}
			}
		} else {
			System.err.println("계좌 수용 공간 부족!!\n다음에 다시 시도해주세요.");
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
		System.out.print("입금액을 입력하세요");
		if (findAccount(ano) != accountArray.length) {
			int balance = scanner.nextInt();
			if (balance >= 0) {
				accountArray[findAccount(ano)].setBalance(balance);
				System.out.println("결과:예금이 성공되었습니다.");
			} else {
				System.out.println("입금액을 확인 후 다시 시도하세요.");
			}
		} else {
			System.out.println("계좌 번호를 확인 후 시도하세요.");
		}
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌 번호:");
		String ano = scanner.next();
		if (findAccount(ano) != accountArray.length) {
			if (pwdCheck(ano)) {
				System.out.println("현재 잔고: " + accountArray[findAccount(ano)].getBalance() + "원 입니다");
				System.out.print("출금액을 입력하세요: ");
				int balance = scanner.nextInt();
				if (balance >= 0 && accountArray[findAccount(ano)].getBalance() >= balance) {
					accountArray[findAccount(ano)].setBalance(-balance);
					System.out.println("결과: 출금이 완료되었습니다.");
				} else {
					System.out.println("출금액을 확인하세요.");
				}
			} else {
				System.out.println("비밀번호 확인 후 다시 시도하세요.");
			}
		} else {
			System.out.println("계좌번호 확인 후 다시 시도하세요.");
		}
	}

	// 이체 메소드
	private static void transfer() {
		System.out.println("--------");
		System.out.println("이체");
		System.out.println("--------");
		System.out.print("출금 계좌번호: ");
		String ano1 = scanner.next();
		if (findAccount(ano1) <= accountArray.length) {
			System.out.print("상대 계좌번호를 입력하세요: ");
			String ano2 = scanner.next();
			if (findAccount(ano2) <= accountArray.length) {
				if (pwdCheck(ano1)) {
					System.out.println("현재 잔고: " + accountArray[findAccount(ano1)].getBalance() + "원 입니다.");
					System.out.print("이체 금액을 입력하세요: ");
					int balance = scanner.nextInt();
					if ((balance >= 0) && (accountArray[findAccount(ano1)].getBalance() >= balance)) {
						accountArray[findAccount(ano1)].setBalance(-balance);
						accountArray[findAccount(ano2)].setBalance(balance);
						System.out.println("결과: 이체 성공");
					} else {
						System.out.println("이체 금액을 확인 후 다시 시도하세요.");
					}
				} else {
					System.out.println("비밀번호 확인 후 다시 시도하세요.");
				}
			} else {
				System.out.println("상대 계좌번호 확인 후 다시 시도하세요.");
			}
		} else {
			System.out.println("계좌번호 확인 후 다시 시도하세요.");
		}
	}

	// 비밀번호 변경 메소드
	private static void changePassword() {
		System.out.println("----------");
		System.out.println("비밀번호 변경");
		System.out.println("----------");

		System.out.print("변경할 비밀번호의 계좌번호 입력 > ");
		String ano = scanner.next();
		if (findAccount(ano) < accountArray.length) {
			if (pwdCheck(ano)) {
				System.out.print("새로운 비밀번호를 입력하세요: ");
				String password = scanner.next();
				if (setPassword(password) != null) {
					accountArray[findAccount(ano)].setPassword(password);
					System.out.println("결과: 비밀번호 변경이 완료되었습니다.");
				} else {
					System.out.println("변경할 비밀번호를 확인 후 다시 시도하세요.");
				}
			} else {
				System.out.println("비밀번호를 확인 후 다시 시도하세요.");
			}
		} else {
			System.out.println("계좌번호 확인 후 다시 시도하세요.");
		}
	}

	// 탈퇴 메소드
	private static void secession() {
		System.out.println("--------");
		System.out.println("회원 탈퇴");
		System.out.println("--------");
		System.out.print("탈퇴 할 계좌 번호> ");
		String ano = scanner.next();
		if (findAccount(ano) < accountArray.length) {
			if (pwdCheck(ano)) {
				System.out.println("정말 탈퇴하시겠습니까?\n[Y/N]");
				char yesNo = scanner.next().charAt(0);
				if (yesNo == 'y' || yesNo == 'Y') {
					accountArray[findAccount(ano)] = null;
					System.out.println("결과: 탈퇴 처리 완료.");
				} else {
					System.out.println("탈퇴 취소");
				}
			} else {
				System.out.println("비밀번호 확인 후 다시 시도하세요.");
			}
		} else {
			System.out.println("계좌번호 확인 후 다시 시도하세요.");
		}

		System.out.println();

	}

	// Account[]에서 anoNo과 같은
	private static int findAccount(String ano) {
		int anoNo = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (!(accountArray[i] == (null)) && (accountArray[i].getAno().equals(ano))) {
				anoNo = i;
				break;
			} else {
				anoNo = accountArray.length;
			}
		}
		return anoNo;
	}

	private static String setPassword(String password1) {
		System.out.print("비밀번호를 입력하세요: ");
		String password2 = scanner.next();
		if (password1.equals(password2)) {
		} else {
			password1 = null;
		}
		return password1;
	}

	// 비밀번호 확인 메소드
	private static boolean pwdCheck(String ano) {
		System.out.print("비밀번호 확인: ");
		for (int i = 0; i < 3; i++) {
			if (i < 3) {
				if (i < 3 & i > 0) {
					System.out.println("비밀번호 오류!");
					System.out.println((3 - (i)) + "회 남았습니다.");
					System.out.print("비밀번호 재확인: ");
				}
				accountArray[findAccount(ano)].getPassword();
				String checkPwd = scanner.next();
				if (accountArray[findAccount(ano)].getPassword().equals(checkPwd)) {
					return true;
				}
			} else if (i == 3) {
				System.out.println("비밀번호 확인 후 다시 시도하세요.");
				return false;
			}
		}
		return false;
	}

	private static int checkArray() {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				return i;
			}
		}
		return accountArray.length;
	}

	private static String makeAno() {
		String ano = null;
		int f = 10000, m = 1000, l = 100000;
		while (ano == null) {
			int fir = (int) (Math.random() * f);
			int mid = (int) (Math.random() * m);
			int last = (int) (Math.random() * l);
			if (fir > f / 10 && mid > m / 10 && last > l / 10) {
				ano = fir + "-" + mid + "-" + last;
				for (int i = 0; i < accountArray.length; i++) {
					if ((accountArray[i] != null) && accountArray[i].getAno().equals(ano)) {
						break;
					}
				}
			}
		}
		return ano;
	}
}