package test0422.test2;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		
		while (isRun) {
			System.out.println("���ڸ� �Է��ϼ���");
			int num = scanner.nextInt();
			if (num%2==0) {
				System.out.println("¦��");
			} else {
				System.out.println("Ȧ��");
			}
			
			System.out.println("����ұ��?");
			char yesNo = scanner.next().charAt(0);
			if (yesNo=='n'||yesNo=='N') {
				isRun = !isRun;
			}
		}
		System.out.println("���α׷� ����");
		
		scanner.close();
	}
}
