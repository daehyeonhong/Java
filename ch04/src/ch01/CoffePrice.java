package ch01;

import java.util.Scanner;

public class CoffePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;

		while (isRun) {
			System.out.println("���� Ŀ�� �帱���?");
			String order = scanner.next();//�Է°��� ���ڿ��� ����
			int price = 0;

			switch (order) {
			case "����������":
			case "īǪġ��":
			case "ī����":
				price=3500;
				break;
			case "�Ƹ޸�ī��": 
				price=2000;
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
			}

			if (price !=0) {
				System.out.println(order+"��"+price+"�� �Դϴ�.");
			}

			System.out.println("��� �ұ��?");

			char yesNo = scanner.next().charAt(0);
			if (yesNo=='n'||yesNo=='N') {
				isRun = !isRun;
			}
		}//while���� ��
		System.out.println("�̿����ּż� �����մϴ�.");
		scanner.close();
	}
}