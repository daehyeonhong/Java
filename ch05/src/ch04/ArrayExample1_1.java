package ch04;

public class ArrayExample1_1 {
	public static void main(String[] args) {
		int[] score = { 78, 98, 54, 76, 87 };
		int max = 0, min = 100;
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} // �ִ�

			if (min > score[i]) {
				min = score[i];
			} // �ּڰ�
			sum += score[i];
		}
		System.out.println("�ּ�����:" + min);
		System.out.println("�ִ�����:" + max);
		System.out.println("����:" + sum);
		System.out.println("���:" + (sum / score.length));
	}
}