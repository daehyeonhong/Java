package ch10.ch03T;

import java.util.Scanner;

class CurrencyConverter {
	private static double rate;

	public static double toDollar(double won) {
		return won / rate;
	}

	public static double toKWR(double dollor) {
		return dollor * rate;
	}

	public static void setRate(double r) {
		rate = r;
	}

}

//public 접근 제한자로 선언 된 클래스 명과 파일 명이 같아야 함.
//name() 메소드가 있는 클래스는 public이어야함.
public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
		System.out.println("$100달러는 " + CurrencyConverter.toKWR(100) + "원 입니다.");
		scanner.close();
	}
}