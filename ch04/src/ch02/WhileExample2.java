package ch02;

import java.util.Scanner;

class WhileExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int count = 0;
			int sum = 0;

			System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");

			int n = scanner.nextInt();

			while (n!=-1) {
				sum+=n;
				count++;
				n=scanner.nextInt();
			}

			if (count==0) System.out.println("입력된 수가 없습니다.");

			else {
				System.out.println("정수의 개수는 "+count+"개 입니다.");
				System.out.println("평균은 "+(double)sum/count+"입니다.");
			}
			System.out.println("계속할까요?");
			char yesNo = scanner.next().charAt(0);
			if (yesNo=='n'||yesNo=='N') {
				break;
			}
		}//while 끝.

		System.out.println("프로그램 종료");
		scanner.close();
	}
}
