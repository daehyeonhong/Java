package ch10.ch04;

import java.util.Calendar;

public class SingletonExample {
	public static void main(String[] args) {
		// Calendar cal = new Calendar();
		// �̱��� ��ü Calendar �ν��Ͻ� ��� ����.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		Calendar cal2 = Calendar.getInstance();
		System.out.println(Calendar.HOUR_OF_DAY);
		Calendar cal3 = Calendar.getInstance();
		System.out.println(Calendar.HOUR_OF_DAY);

		// Calendar�� ���� �ٸ� ��ü
		System.out.println(cal2 == cal3);
		System.out.println(cal2.equals(cal3));
	}
}