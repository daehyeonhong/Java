package ch03;

import java.util.Scanner;

//삼항연산: 피연산자의 수가 3개인 연산
public class ConditionalOperationExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade;
		if(score>90) {
			grade='A';
		} else if (score>80) {
			grade='B';
		} else if (score>70) {
			grade='C';
		} else if (score>60) {
			grade='D';
		} else if (score>50) {
			grade='E';
		} else {
			grade='F';
		}
		System.out.println(grade);
		
		//삼항연산식
		grade = score>90? 'A' : score>80? 'B' : score>70? 'C' : score>60? 'E' : 'F';
		System.out.println(grade);
		scanner.close();
	}
}
