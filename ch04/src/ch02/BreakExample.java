package ch02;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���ڿ� ��� ����ô� \"exit\"�� �Է��ϼ���");
		while (true) {
			String str = scanner.nextLine();
			if(str.equals("exit")) break;
			System.out.println(str);
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}
}