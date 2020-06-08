package Exercise.DATE0428;

import java.util.Scanner;

/*50개의 점수(0~100사이의 값)를 입력받고
점수가 70점 이상이면 합격 미만이면 불합격을 출력하고
50명의 점수를 성적순으로 출력하시오.
50명의 총점 및 평균(소수점표시)도 출력하시오*/

public class IntArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] score = new int[5];
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하세요.\n(0~100)");
			score[i] = scanner.nextInt();
			if (score[i] > 100 || score[i] < 0) {
				System.out.println("다시 입력하세요.\n(0~100)");
				score[i] = scanner.nextInt();
			}
			sum += score[i];
			System.out.println(score[i] >= 70 ? "합격!" : "불합격!");
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] < score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}

			}
			System.out.println(i+1 + "등:" + score[i] + "점");
		}
		System.out.println("총점:" + sum);
		System.out.println("평균:" + (double) sum / score.length);
		scanner.close();
	}
}