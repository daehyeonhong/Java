package ch02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int time = 5000;
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		
		while(play) {
			System.out.println("������ �Է��ϼ���: ");
			
			time = scanner.nextInt();
			
			int second = time % 60;
			int minute = (time / 60) % 60;//int/int��
			int hour = (time / 60) / 60;
			
			System.out.print(time + "�ʴ� ");
			System.out.print(hour + "�ð�, ");
			System.out.print(minute + "��, ");
			System.out.println(second + "�� �Դϴ�.");
			
			System.out.println("����ұ��?");
			char yesNo = scanner.next().charAt(0);
			if(yesNo=='n' || yesNo=='N') {//���� �� ==
				play =! play;
			}
		}//while�� ����
		System.out.println("��");
		scanner.close();
	}
}
