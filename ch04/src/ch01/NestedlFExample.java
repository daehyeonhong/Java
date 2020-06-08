package ch01;

import java.util.Scanner;

class NestedlFExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;

		while (isRun) {

			System.out.println("점수를 입력하세요(0~100)");
			int score = scanner.nextInt();

			System.out.println("학년을 입력하세요(1~4)");
			int year = scanner.nextInt();

			if (score >= 60) {//60점 이상 조건 예)65,2학년
				if (year != 4) {//1,2,3 4학년 이상 조건
					System.out.println("합격!");
				} else if (score >=70) {//4 & 70 이상
					System.out.println("합격!");
				}
				else {// 4 & 70 미만
					System.out.println("불합격");
				}
			} else {//58, 1, ... 55, 4
				System.out.println("불합격");
			}
			System.out.println("계속할까요?");
			char yesNo = scanner.next().charAt(0);
			if (yesNo=='n' || yesNo=='N') {
				isRun = !isRun;				
			}
			System.out.println("종료합니다.");
		}//while 끝
		scanner.close();
	}
}
