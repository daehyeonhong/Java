package ch02;

import java.util.Scanner;

public class NestedForExample1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("����� ������ �� �� �Է�.");
			int startNum = scanner.nextInt();

			System.out.println("����� ������ �� �� �Է�.");
			int stopNum = scanner.nextInt();

			for (int i = 1; i <= 9; i++) {
				for (int j = startNum; j <= stopNum; j++) {
					System.out.print(j+"x"+i+"="+(i*j)+"\t");
				}
				System.out.println();
			}

			System.out.println("��� �ұ��?");
			String yesNo = scanner.next();
			
			if ("n".equals(yesNo)||"N".equals(yesNo)) {//yesNo.equals("Y")
				break;
			}
		} while (true);

		System.out.println("���α׷� ����");
		scanner.close();
	}
}