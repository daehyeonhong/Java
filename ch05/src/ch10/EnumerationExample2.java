package ch10;

import java.util.Calendar;//�޷� ������ ������ �ִ� ��ü

public class EnumerationExample2 {
	public static void main(String[] args) {
		Week today = null;// ����Ÿ�� ���� ����

		// Calendar�� new Calendar()�� �������� ����.
		// Calendar�� �߻�(abstract) Ŭ������ new�� ������ �� ����.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);// 4
		String day = null;
		System.out.println("week: " + week);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			day = "�Ͽ���";
			break;
		case 2:
			today = Week.MONDAY;
			day = "������";
			break;
		case 3:
			today = Week.TUESDAY;
			day = "ȭ����";
			break;
		case 4:
			today = Week.WEDNESDAY;
			day = "������";
			break;
		case 5:
			today = Week.THURSDAY;
			day = "�����";
			break;
		case 6:
			today = Week.FRIDAY;
			day = "�ݿ���";
			break;
		case 7:
			today = Week.SATURDAY;
			day = "�����";
			break;
		}
		System.out.println("���� ����: " + today);
		System.out.println("���� ����: " + day);

		// ���� ��� �� �� == Week.�����
		if (today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}
	}
}