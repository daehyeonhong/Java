package ch10.ch03;

import java.util.Scanner;

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("환율(1달러)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("$100달러는 "+CurrencyConverter.toKWR(100)+"원 입니다.");
		scanner.close();
	}
}