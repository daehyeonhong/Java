package Test0515.Bank;

import java.util.Scanner;

public class BankApplication {

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
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1.계좌 생성 | 2.로그인&로그아웃 | 3.계좌 목록 | 4.예금 | 5.출금 | 6.이체 | 7.비밀번호 변경 | 8.탈퇴 | 9.종료");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				logon();
				break;
			case 3:
				accountList();
				break;
			case 4:
				deposit();
				break;
			case 5:
				withdraw();
				break;
			case 6:
				transfer();
				break;
			case 7:
				changePassword();
				break; // 비밀번호를 변경하는 메소드 추가
			case 8:
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
		String againPassword = scanner.next();
		if (!(password.equals(againPassword))) {
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

	private static void logon() {
		System.out.println("--------------");
		System.out.println("계좌 로그인&로그아웃");
		System.out.println("--------------");
		System.out.print("계좌번호를 입력하세요: ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account == null) {
			System.out.println("결과: 계좌번호 오류\n계좌번호 확인 후 다시 시도해주세요.");
		} else {
			account.isLogon();
			if (account.isLogon() == true) {
				System.out.println("로그아웃 하시겠습니까?\n[Y/N]");
				char yesNo = scanner.next().charAt(0);
				if (yesNo == 'y' || yesNo == 'Y') {
					account.setLogon(!account.isLogon());
					System.out.println("결과: 로그아웃 되었습니다.");
				} else {
					account.setLogon(account.isLogon());
					System.out.println("결과: 로그아웃 요청이 취소되었습니다.");
				}
			} else {
				for (int i = 0; i < 3; i++) {
					System.out.print("비밀번호를 입력하세요: ");
					String password = scanner.next();
					pwdCheck(account.getAno(), password);
					if (run == true) {
						System.out.println(account.getOwner() + "님 로그인 되었습니다.");
						account.setLogon(!account.isLogon());
						break;
					} else {
						if (i != 2) {
							System.out.println("비밀번호 오류!!!\n" + (3 - (i + 1)) + "회 남았습니다.");
						} else if (i == 2) {
							System.out.println("3회 오류!!! 다시 시도하세요.");
						}
					}
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
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌 번호:");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account != null) {
			if (account.isLogon() == true) {
				System.out.println(account.getOwner() + "님 환영합니다. 예금액을 입력해주세요.");
				System.out.print("예금액: ");
				int balance = scanner.nextInt();
				account.setBalance(balance);
				System.out.println("결과:예금이 성공되었습니다.");
			} else {
				System.out.println("로그인 후 다시 시도하세요.");
			}
		} else {
			System.out.println("계좌번호 확인 후 다시 시도하세요.");
		}
	}

	// 출금하기
	private static void withdraw() {
		try {
			System.out.println("--------");
			System.out.println("출금");
			System.out.println("--------");
			System.out.print("계좌 번호:");
			String ano = scanner.next();
			Account account = findAccount(ano);
			// 비밀번호를 입력받는 부분 추가

			if (account != null) {

				if (account.isLogon() == true) {
					System.out.println();
					System.out.println(account.getOwner() + "님 환영합니다. 출금을 위해 비밀번호를 입력해주세요.");
					for (int i = 0; i < 3; i++) {
						System.out.print("비밀번호 입력 : ");
						String password = scanner.next();
						pwdCheck(ano, password);
						if (run == true) {
							break;
						} else {
							System.out.println("비밀번호 오류!!!");
							if (i < 2) {
								System.out.println((3 - (i + 1)) + "회 남았습니다.");
							} else if (i == 2) {
								System.out.println("비밀번호 오류! 확인 후 다시 시도하세요");
							}
						}
					}
					if (run == true) {
						System.out.println(account.getOwner() + "님의 잔고: " + account.getBalance() + "원 입니다.");
						System.out.print("출금액: ");
						int balance = scanner.nextInt();
						if (balance <= 0) {
							System.out.println("출금액을 확인 후 다시 시도해주세요");
						}
						account.setBalance(-balance);
						System.out.println("결과: 출금이 성공되었습니다.");
					} else {
						System.out.println("결과: 출금 실패! 다시 시도하세요.");
					}
				} else {
					System.out.println("로그인 후 다시 시도하세요.");
				}
			} else {
				System.out.println("계좌번호 확인 후 다시 시도하세요.");
			}
		} catch (Exception e) {
			System.out.println("계좌번호 확인 후 다시 시도해주세요.");
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

		if (account1 != null) {

			if (account1.isLogon() == true) {
				System.out.println(account1.getOwner() + "님 환영합니다. 출금을 위해 비밀번호를 입력해주세요.");
				// 비밀번호를 입력받는 부분 추가
				System.out.print("비밀번호 입력 : ");
				String password = scanner.next();

				// 입력된 값들이 서로 같은 객체를 참조하고 있는지를 확인합니다.
				// 서로 맞다면 run 변수는 true 값을 갖고 아래의 if 문을 실행하게 됩니다.
				pwdCheck(ano1, password);
				if (run == true) {
					System.out.print("이체 상대 계좌번호: ");
					String ano2 = scanner.next();
					Account account2 = findAccount(ano2);

					if (account2 != null) {
						System.out.print("이체 금액: ");
						int balance = scanner.nextInt();

						if (balance < account1.getBalance()) {
							account1.setBalance(-balance);
							account2.setBalance(balance);
							System.out.println("결과: 이체가 성공되었습니다.");
						} else {
							System.out.println("이체 금액을 확인 후 다시 시도하세요.");
						}
					} else {
						System.out.println("결과: 이체 실패! 상대방 계좌번호를 확인 후 다시 시도하세요.");
					} // if else
				}
			} else {
				System.out.println("로그인 후 다시 시도하세요.");
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
		System.out.print("비밀번호를 변경할 계좌번호 입력 > ");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if (account != null) {
			if (account.isLogon() == true) {
				System.out.println(account.getOwner() + "님 환영합니다. 회원탈퇴를 위해 비밀번호를 입력해주세요.");

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
				}
			} else {
				System.out.println("로그인 후 다시 시도하세요.");
			} // while
		} else {
			System.out.println("계좌번호를 확인 후 다시 시도하세요.");
		}
	}

	// 탈퇴 메소드
	private static void secession() {
		try {
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
				if (yesNo == 'y' || yesNo == 'Y') {
					for (int i = 0; i < accountArray.length; i++) {
						if (accountArray[i].getAno().equals(ano)) {
							accountArray[i] = null;
							System.out.println("결과: 탈퇴가 완료되었습니다.");
							break;
						}
					} // for
				} else {
					System.out.println("결과: 탈퇴 요청이 취소되었습니다.");
				} // yesNo를 묻는 if
			} // run을 묻는 if
		} catch (Exception e) {
			System.out.println("계좌번호 확인 후 다시 시도하세요.");
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

	// 비밀번호 확인 메소드
	private static void pwdCheck(String ano, String password) {
		Account account = findAccount(ano);
		if (account != null && account.getPassword().equals(password)) {
			run = true;
		} else {
			run = false;
		}
	}

	private static String pwd3Check(String ano) {
		String password = null;
		for (int i = 0; i < 3; i++) {
			System.out.print("비밀번호 입력 : ");
			password = scanner.next();
			pwdCheck(ano, password);
			if (run == true) {
				break;
			} else {
				System.out.println("비밀번호 오류!!!");
				if (i < 2) {
					System.out.println((3 - (i + 1)) + "회 남았습니다.");
				} else if (i == 2) {
					System.out.println("비밀번호 오류! 확인 후 다시 시도하세요");
				}
			}
		}
		return password;
	}
}// class 끝