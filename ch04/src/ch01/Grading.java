package ch01;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
		
		System.out.println("점수를 입력하세요(0~100); ");
		int score = scanner.nextInt();
		if (score >= 90) {
			grade = 'A';
		}else if (score >=80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';
		}else if (score >= 50) {
			grade = 'E';
		}else {
			grade = 'F';
		}
		
		System.out.println(score>=90? 'A' : score>=80? 'B' :
						   score>=70? 'C' : score>=60? 'D' : 
						   score>=50? 'E' : 'F');
		System.out.println("학점은"+grade+"입니다.");
		
		scanner.close();
	}
}
