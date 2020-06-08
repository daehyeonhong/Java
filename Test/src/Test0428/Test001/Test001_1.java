package Test0428.Test001;

import java.util.Scanner;

/*5개의 점수(0~100사이의 값)를 입력받고
점수가 70점 이상이면 합격 미만이면 불합격을 출력하고
5명의 점수를 성적순으로 출력하시오.
5명의 총점 및 평균(소수점표시)도 출력하시오*/

public class Test001_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하세요.\n(0~100)");
			score[i] = scanner.nextInt();
			sum += score[i];
			System.out.println(score[i] >= 70 ? "합격" : "불합격");
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				int temp = 0;
				if (score[i] < score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			System.out.println(score[i]);
		}
		System.out.println(sum);
		System.out.println(sum / score.length);
		scanner.close();
	}
}