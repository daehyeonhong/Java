package ch01;

import java.util.Scanner;

public class SuccessoOrFailExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scanner.nextInt();
		
		if (score>=80) System.out.println("�����մϴ�! �հ��Դϴ�.");			
		
		System.out.println(score>=80? "�����մϴ�! �հ��Դϴ�." : "");
		scanner.close();
	}
}
