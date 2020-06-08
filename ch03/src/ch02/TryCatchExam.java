package ch02;

import java.util.Scanner;

public class TryCatchExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {//명령문
			int num = scanner.nextInt();
			System.out.println("출력:"+num);
		} catch (Exception e) {//Exception e; <-예외(오류)발생시 JVM이 예외객체를 생성함.
			//예외 발생시 처리 명령문, 예외 메시지 출력문
			System.out.println("예외가 발생하였습니다.");
		}
		scanner.close();
	}
}
