package test0422.test2;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		
		while (isRun) {
			System.out.println("숫자를 입력하세요");
			int num = scanner.nextInt();
			if (num%2==0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
			
			System.out.println("계속할까요?");
			char yesNo = scanner.next().charAt(0);
			if (yesNo=='n'||yesNo=='N') {
				isRun = !isRun;
			}
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
	}
}
