package ch02;

import java.util.Scanner;

public class DoWhileExample2 {
	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");

		Scanner scanner = new Scanner(System.in);
		String inputString;

		do {
			System.out.print(">");
			inputString = scanner.nextLine();// ���� ���ڿ� �Է¹ޱ�
			System.out.println(inputString);
		} while (! inputString.equals("q"));//���ڿ� �񱳿����� equals�� ����Ѵ�.

		System.out.println();
		System.out.println("���α׷� ����.");
		scanner.close();
	}
}
