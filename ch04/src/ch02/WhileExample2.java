package ch02;

import java.util.Scanner;

class WhileExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int count = 0;
			int sum = 0;

			System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");

			int n = scanner.nextInt();

			while (n!=-1) {
				sum+=n;
				count++;
				n=scanner.nextInt();
			}

			if (count==0) System.out.println("�Էµ� ���� �����ϴ�.");

			else {
				System.out.println("������ ������ "+count+"�� �Դϴ�.");
				System.out.println("����� "+(double)sum/count+"�Դϴ�.");
			}
			System.out.println("����ұ��?");
			char yesNo = scanner.next().charAt(0);
			if (yesNo=='n'||yesNo=='N') {
				break;
			}
		}//while ��.

		System.out.println("���α׷� ����");
		scanner.close();
	}
}
