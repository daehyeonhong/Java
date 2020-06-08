package ch02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int time = 5000;
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		
		while(play) {
			System.out.println("정수를 입력하세요: ");
			
			time = scanner.nextInt();
			
			int second = time % 60;
			int minute = (time / 60) % 60;//int/int몫
			int hour = (time / 60) / 60;
			
			System.out.print(time + "초는 ");
			System.out.print(hour + "시간, ");
			System.out.print(minute + "분, ");
			System.out.println(second + "초 입니다.");
			
			System.out.println("계속할까요?");
			char yesNo = scanner.next().charAt(0);
			if(yesNo=='n' || yesNo=='N') {//문자 비교 ==
				play =! play;
			}
		}//while문 종료
		System.out.println("끝");
		scanner.close();
	}
}
