package ch02;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자열 출력 종료시는 \"exit\"을 입력하세요");
		while (true) {
			String str = scanner.nextLine();
			if(str.equals("exit")) break;
			System.out.println(str);
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}