package Exercise.DATE0428;

import java.util.Scanner;

/*50���� ����(0~100������ ��)�� �Է¹ް�
������ 70�� �̻��̸� �հ� �̸��̸� ���հ��� ����ϰ�
50���� ������ ���������� ����Ͻÿ�.
50���� ���� �� ���(�Ҽ���ǥ��)�� ����Ͻÿ�*/

public class IntArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] score = new int[5];
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.println("������ �Է��ϼ���.\n(0~100)");
			score[i] = scanner.nextInt();
			if (score[i] > 100 || score[i] < 0) {
				System.out.println("�ٽ� �Է��ϼ���.\n(0~100)");
				score[i] = scanner.nextInt();
			}
			sum += score[i];
			System.out.println(score[i] >= 70 ? "�հ�!" : "���հ�!");
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}

			}
			System.out.println(i+1 + "��:" + score[i] + "��");
		}
		System.out.println("����:" + sum);
		System.out.println("���:" + (double) sum / score.length);
		scanner.close();
	}
}