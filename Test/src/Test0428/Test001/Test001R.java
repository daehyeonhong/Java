package Test0428.Test001;

//88,59,78,79,95
//5개점수(0~100사이의 값)를 입력받고
//점수가 70이상이면 "합격" 미만이면 "불합격"을 출력하고
//5명의 점수를 성적순으로 출력하시오.
//5명의 총점 및 평균(소수점표시)도 출력하시오. 
import java.util.Scanner;

public class Test001R {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;

		// 점수 저장 및 합구하기
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하세요>");
			score[i] = scanner.nextInt();
			sum += score[i];
			System.out.println(score[i] >= 70 ? "합격" : "불합격");
		}
		// 정렬
		int temp;
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] < score[j]) {// 내림차순 정렬
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		} // for문 끝.
		// 오름차순 출력
		// 합격여부확인
		for (int i = 0; i < score.length; i++)
			System.out.println(i + ":" + score[i] + (score[i] >= 70 ? "합격" : "불합격"));

		// 총점
		System.out.println("총점:" + sum);
		// 평균
		System.out.println("평균:" + (double) sum / score.length);

		scanner.close();
	}
}