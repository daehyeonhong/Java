package ch10;

import java.util.Scanner;

public class EnumerationExample3 {
	public static void main(String[] args) {
		LoginResult result = null;
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		while (true) {
			System.out.print("아이디를 입력하세요: ");
			String id = scanner.next();
			System.out.print("비밀번호를 입력하세요: ");
			String pwd = scanner.next();

			if (id.equals("hong") && pwd.equals("1234")) {
				result = LoginResult.Login_SUCCESS;
			} else {
				result = LoginResult.Login_FAIL;
				System.out.println("잘못 입력하셨습니다.");
				count++;
				if (count == 3) {
					System.out.println("3회 잘못 입력하셨습니다.");
					break;
				}
			}
		} // while문 끝.
		System.out.println("결과:" + result);

		System.out.println("프로그램 종료");
		scanner.close();
	}
}