package ch02;

import java.util.Scanner;

public class DoWhileExample2 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();// 한줄 문자열 입력받기
			System.out.println(inputString);
		} while (! inputString.equals("q"));//문자열 비교에서는 equals를 사용한다.

		System.out.println();
		System.out.println("프로그램 종료.");
		scanner.close();
	}
}
