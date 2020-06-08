package ch03;

import java.util.Scanner;

//입력값이 2의 배수 혹은 3의 배수인지 확인 문제
public class CompareOperatorExam_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();
		if ((num==0)|(num==0.0)) {
			System.out.println("0이 아닌 수를 입력해주세요.");
		} else if ((num%2==0)||(num%3==0)) {
			System.out.println("입력된 수는 2 혹은 3의 배수입니다.");
		} else {
			System.out.println("입력된 수는 2 혹은 3의 배수가 아닙니다.");
		}
		scanner.close();
	}
}