package ch10;

import java.util.Scanner;

public class EnumerationExample3 {
	public static void main(String[] args) {
		LoginResult result = null;
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		while (true) {
			System.out.print("���̵� �Է��ϼ���: ");
			String id = scanner.next();
			System.out.print("��й�ȣ�� �Է��ϼ���: ");
			String pwd = scanner.next();

			if (id.equals("hong") && pwd.equals("1234")) {
				result = LoginResult.Login_SUCCESS;
			} else {
				result = LoginResult.Login_FAIL;
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				count++;
				if (count == 3) {
					System.out.println("3ȸ �߸� �Է��ϼ̽��ϴ�.");
					break;
				}
			}
		} // while�� ��.
		System.out.println("���:" + result);

		System.out.println("���α׷� ����");
		scanner.close();
	}
}