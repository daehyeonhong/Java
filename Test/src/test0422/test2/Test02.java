package test0422.test2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//Ű����� ���� �Է� ���� Scanner �ν��Ͻ� ����
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		int num1;
		System.out.println("������ �Է��ϼ���.");
		
		while (play) {
			num1 = scanner.nextInt();
			int num2 = num1%2;

			if (num2==0) {
				System.out.println("¦���Դϴ�.");
			} else {
				System.out.println("Ȧ���Դϴ�.");
			}
			
			System.out.println("����ұ��?\n�����Ϸ��� \'N\' �Ǵ� \'n\'Ű�� �����ּ���.");
			char yesNo = scanner.next().charAt(0);
			
			if (yesNo=='n' || yesNo=='N') {
				play =! play;
			} else {
				System.out.println("���� ������ �Է��ϼ���.");
			}
		}
		System.out.println("�����մϴ�.");
		scanner.close();
	}
}
