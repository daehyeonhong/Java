package part2.ex1.score;

import java.util.Scanner;

public class StruckturedProgram {

	public static void main(String[] args) {
		int[] korList = new int[3];
		boolean keepLoop = true;
		while (keepLoop) {
			switch (inputMenu()) {
			case 1:
				inputScore(korList);
				break;
			case 2:
				printScore(korList);
				break;
			case 3:
				System.out.println("Bye~~");
				keepLoop = false;
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}
	}

	private static int inputMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		int menu = scanner.nextInt();
		return menu;
	}

	static void printScore(int[] kors) {
		int total = 0;
		float avg;
		for (int i = 0; i < 3; i++)
			total += kors[i];
		avg = total / 3.0f;
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		for (int i = 0; i < 3; i++)
			System.out.printf("국어 %d : %3d\n", 3 - i, kors[i]);
		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("─────────────────────────────");
	}

	static void inputScore(int[] kors) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("국어%d : ", i + 1);
				Scanner scanner = new Scanner(System.in);
				kors[i] = scanner.nextInt();
				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
			} while (kors[i] < 0 || 100 < kors[i]);
		System.out.println("─────────────────────────────");
	}
}
