package Test0428.Test001;

import java.util.Scanner;

/*5���� ����(0~100������ ��)�� �Է¹ް�
������ 70�� �̻��̸� �հ� �̸��̸� ���հ��� ����ϰ�
5���� ������ ���������� ����Ͻÿ�.
5���� ���� �� ���(�Ҽ���ǥ��)�� ����Ͻÿ�*/

public class Test001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;

		// ���� ���� �� �� ���ϱ�
		for (int i = 0; i < score.length; i++) {
			System.out.println("������ �Է��ϼ���\n(0~100����)");
			score[i] = scanner.nextInt();
			sum += score[i];
			System.out.println(score[i] >= 70 ? "�հ�" : "���հ�");
		}
		// ����
		int temp;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] < score[j]) {// �������� ����
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		} // for�� ��.
		// �������� ���
		// �հݿ���Ȯ��
		for (int i = 0; i < score.length; i++) {
			System.out.println("" + score[i]);
		}
		// ����
		System.out.println("����:" + sum);
		// ���
		System.out.println("���:" + (double) sum / score.length);

		scanner.close();
	}
}