package ch10;

import java.util.Scanner;

public class EnumerationExample4 {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		// name() �޼ҵ�
		String name = today.name();// "SUNDAY"
		System.out.println(name);

		// ordinal() �޼ҵ�
		int ordinal = today.ordinal();// SUNDAY.ordinal
		System.out.println(ordinal);

		// compareTo() �޼ҵ� - �� ���Ż������ ���� ��
		Week day1 = Week.MONDAY;// ordinal-0
		Week day2 = Week.WEDNESDAY;// ordinal-2
		int result1 = day1.compareTo(day2);
		System.out.println(day1.ordinal() - day2.ordinal());
		System.out.println(result1);

		if (day1.ordinal() - day2.ordinal() > 0) {
			System.out.println("day1�� day2���� ���������� �ڿ� ����");
		} else if (day1.ordinal() - day2.ordinal() < 0) {
			System.out.println("day1�� day2���� ���������� �տ� ����");
		} else// day1.ordinal()-day2.ordinal()==0
		{
			System.out.println("day1�� day2�� ���������� ����");
		}
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		System.out.println(day2.ordinal() - day1.ordinal());

		// valueOf() �޼ҵ� - ���ڿ��� �Է� ���� ���� ���� ����� ��ȯ�ϴ� �޼ҵ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �����빮�ڷ� �Է��ϼ���.");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay);
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("�ָ��Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}

		// values() �޼ҵ�
		// ����Ÿ�� ��� �迭
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}
}