package ch02;

import java.util.Scanner;
//������
public class ForExample9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("����� ���� ���� �Է��ϼ���.");
			int num = scanner.nextInt();
			
			for (int i = 1; i <= 9; i++) {
				System.out.print(num+"x"+i+"="+(num*i)+"\t");
			}
			System.out.println();//�� �� �Ʒ���			
			System.out.println("����ұ��?");

			char yesNo = scanner.next().charAt(0);

			if (yesNo=='N'||yesNo=='n') {
				break;
			}
		}
		System.out.println("�����մϴ�.");
		scanner.close();
	}
}
