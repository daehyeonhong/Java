package ch04;

public class ArrayExample1_2 {
	public static void main(String[] args) {
		int[] score = { 78, 98, 54, 76, 87 };// 54,76,78,87,98������ ����
		int temp;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {//�������� ����
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		} // for�� ��

		// �������� ���
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		// �������� ���
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {//�������� ����
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		// �������� ���
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		// �������� ���
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}

	}
}