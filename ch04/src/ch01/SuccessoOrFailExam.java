package ch01;

import java.util.Scanner;

public class SuccessoOrFailExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt();
		
		if (score>=80) System.out.println("축하합니다! 합격입니다.");			
		
		System.out.println(score>=80? "축하합니다! 합격입니다." : "");
		scanner.close();
	}
}
