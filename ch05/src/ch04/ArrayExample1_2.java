package ch04;

public class ArrayExample1_2 {
	public static void main(String[] args) {
		int[] score = { 78, 98, 54, 76, 87 };// 54,76,78,87,98순으로 정렬
		int temp;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {//오름차순 정렬
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		} // for문 끝

		// 오름차순 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		// 내림차순 출력
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {//내림차순 정렬
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		// 내림차순 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		// 오름차순 출력
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}

	}
}