/*
비밀번호 설정 및 체크
계좌 값을 받고 비밀번호를 리턴


계좌 생성시 비밀번호 생성
새 비밀번호 받고
<<비밀번호 확인>>
새 비밀번호 계좌에 입력


~~<<계좌 확인>>
비밀번호 변경(확인된 계좌의 비밀번호)
<<비밀번호 확인>> false;
맞으면
새 비밀번호 입력
<<비밀번호 확인>>(새 비밀번호) false;
새 비밀번호 값 리턴


<계좌 확인>(계좌번호)
계좌 존재 여부 확인
계좌배열[findAccount]


비밀번호 확인(배열 번지값)
배열[번지값]의 비밀번호a 호출
비밀번호b 입력
비밀번호a/b 대조
맞으면 true; 다르면 false;

계좌확인(계좌번호)
입력 받은 계좌번호 찾고
있으면 계좌의 배열 번지수 리턴



비밀번호 생성
최초 계좌 생성
비밀번호 입력&확인 후 스트링 비밀번호리턴
널값이면 다시 시도하세요

입력받은 비밀번호


비밀번호 변경
<<계좌번호 조회
해당 비밀번호 호출>>

비밀번호와 사용자 입력 비밀번호 대조
맞으면 스트링 비밀번호 리턴
틀리면 널 값 리턴

비밀번호 변경시에는
계좌번호 받고
유효한 값이면 setPassword
널값이면 실패 메시지

겹치는 부분 첫 비밀번호와 두번째 비밀번호가 같으면
비밀번호 값 리턴;
다르면 널값 리턴




이체
계좌 확인, 계좌 정보 확인
상대 계좌 정보 확인
이체 가능 여부 확인
이체




가입 시 비밀번호 확인----------
계좌 조회 실패 try catch
출금 잔액 확인
출금 실패 안내
pwdCheck-false 계좌와 비밀번호를 확인하세요
탈퇴 실패 안내 (탈퇴 취소)*/

package Bank;

import java.util.Scanner;

public class BankApplication {
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
				System.err.println("입력 오류");
				break;
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
		System.out.print("설정하려는 비밀번호를 입력하세요.");
		String password = scanner.next();
		if (setPassword(password) == null) {
			System.out.println("비밀번호 확인 후 다시 시도하세요.");
		} else {
			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] == null) {
					System.out.print("초기 입금액을 입력하세요: ");
					int balance = scanner.nextInt();
					accountArray[i] = new Account((ANO_NO + "-" + (++seq) + seq + seq), owner, balance, password);
					System.out.println("계좌가 생성되었습니다.");
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

	// Account[]에서 ano와 동일한 Account 객체 찾기
	private static int findAccount(String ano) {
		int anoNo = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if (!(accountArray[i] == (null)) && accountArray[i].getAno().equals(ano)) {
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
		accountArray[findAccount(ano)].getPassword();
		System.out.print("비밀번호 확인: ");
		String checkPwd = scanner.next();
		if (accountArray[findAccount(ano)].getPassword().equals(checkPwd)) {
			return true;
		} else {
			return false;
		}
	}
}
