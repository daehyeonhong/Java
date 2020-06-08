package ch02;

import java.util.Scanner;
//구구단
public class ForExample9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("출력할 단의 수를 입력하세요.");
			int num = scanner.nextInt();
			
			for (int i = 1; i <= 9; i++) {
				System.out.print(num+"x"+i+"="+(num*i)+"\t");
			}
			System.out.println();//한 줄 아래로			
			System.out.println("계속할까요?");

			char yesNo = scanner.next().charAt(0);

			if (yesNo=='N'||yesNo=='n') {
				break;
			}
		}
		System.out.println("종료합니다.");
		scanner.close();
	}
}
