package test0422.test2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//키보드로 부터 입력 받은 Scanner 인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		int num1;
		System.out.println("정수를 입력하세요.");
		
		while (play) {
			num1 = scanner.nextInt();
			int num2 = num1%2;

			if (num2==0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
			
			System.out.println("계속할까요?\n중지하려면 \'N\' 또는 \'n\'키를 눌러주세요.");
			char yesNo = scanner.next().charAt(0);
			
			if (yesNo=='n' || yesNo=='N') {
				play =! play;
			} else {
				System.out.println("다음 정수를 입력하세요.");
			}
		}
		System.out.println("중지합니다.");
		scanner.close();
	}
}
