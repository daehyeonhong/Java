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

//public ���� �����ڷ� ���� �� Ŭ���� ��� ���� ���� ���ƾ� ��.
//name() �޼ҵ尡 �ִ� Ŭ������ public�̾����.
public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸���� $" + CurrencyConverter.toDollar(1000000) + "�Դϴ�.");
		System.out.println("$100�޷��� " + CurrencyConverter.toKWR(100) + "�� �Դϴ�.");
		scanner.close();
	}
}