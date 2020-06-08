package Exercise0429.Exercise009;

import java.util.Scanner;

//키보드로부터 입력 받은 학생들의 최고 점수 및 평균
public class Exercise009T {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			try {
				if (selectNo == 1) {
					System.out.print("학생수> ");
					studentNum = scanner.nextInt();// 배열의 길이 입력 받기
					scores = new int[studentNum];// 길이만큼의 배열 생성
				} else if (selectNo == 2) {
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]: ");
						scores[i] = scanner.nextInt();
					}
				} else if (selectNo == 3) {
					for (int s : scores) {
						System.out.print(s + "\t");
					}
					System.out.println();
				} else if (selectNo == 4) {
					int temp = 0;
					int sum = 0;
					for (int i = 0; i < scores.length; i++) {
						for (int j = i + 1; j < scores.length; j++)
							if (scores[i] > scores[j]) {
								temp = scores[i];
								scores[i] = scores[j];
								scores[j] = temp;
							} // 안쪽 for문
						sum += scores[i];
						System.out.println("sum: " + sum);
					} // 바깥쪽 for문
					System.out.println("최고점수: " + scores[scores.length - 1]);
					System.out.println("평균점수: " + (double) sum / scores.length);
				} else if (selectNo == 5) {
					run = !run;
				}
			} catch (NullPointerException e) {
				System.out.println("학생 수를 먼저 입력하세요.");
				continue;
			}
		} // while문 끝
		System.out.println("프로그램 종료");
		scanner.close();
	}
}