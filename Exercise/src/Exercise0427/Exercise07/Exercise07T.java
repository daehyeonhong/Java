package Exercise0427.Exercise07;

//7 while���� Scanner �̿� ����, ���, �ܰ� ��ȸ �� ����
import java.util.Scanner;

public class Exercise07T {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;// �ܰ� �ʱ�ȭ

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------");
			System.out.print("����> ");

			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.println("���ݾ�>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.println("��ݾ�>");
				int amount = scanner.nextInt();
				if (balance - amount < 0) {
					System.out.println("��ݾ��� �ܰ��� �����ϴ�.");
					continue;
				}
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;

			default:
				run = false;
				break;
			}
		}

		System.out.println("���α׷� ����");

		scanner.close();
	}
}