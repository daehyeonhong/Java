package ch03;

import java.util.Scanner;

//�Է°��� 2�� ��� Ȥ�� 3�� ������� Ȯ�� ����
public class CompareOperatorExam_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int num = scanner.nextInt();
		if ((num==0)|(num==0.0)) {
			System.out.println("0�� �ƴ� ���� �Է����ּ���.");
		} else if ((num%2==0)||(num%3==0)) {
			System.out.println("�Էµ� ���� 2 Ȥ�� 3�� ����Դϴ�.");
		} else {
			System.out.println("�Էµ� ���� 2 Ȥ�� 3�� ����� �ƴմϴ�.");
		}
		scanner.close();
	}
}