package ch10.ch03;

import java.util.Scanner;

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸���� $"+CurrencyConverter.toDollar(1000000)+"�Դϴ�.");
		System.out.println("$100�޷��� "+CurrencyConverter.toKWR(100)+"�� �Դϴ�.");
		scanner.close();
	}
}