package ch02;

import java.util.Scanner;

public class TryCatchExam2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("여기는 try~catch블럭 밖");
		int num = 0;

		try {
			num = scanner.nextInt();
			System.out.println("num:"+num);
			System.out.println(1+2);
			System.out.println("hello");
			System.out.println(10.0+20);
		} catch (Exception e) {
			System.out.println("입력타입이 맞지 않습니다.");
		}
		System.out.println("여기도 try~catch블럭 밖");
		scanner.close();
	}
}
