package test0422.test1;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		System.out.println(score>70? "pass" : "fail");
		scanner.close();
	}
}
