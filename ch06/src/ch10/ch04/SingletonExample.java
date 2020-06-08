package ch10.ch04;

import java.util.Calendar;

public class SingletonExample {
	public static void main(String[] args) {
		// Calendar cal = new Calendar();
		// 싱글톤 객체 Calendar 인스턴스 얻어 오기.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		Calendar cal2 = Calendar.getInstance();
		System.out.println(Calendar.HOUR_OF_DAY);
		Calendar cal3 = Calendar.getInstance();
		System.out.println(Calendar.HOUR_OF_DAY);

		// Calendar는 서로 다른 객체
		System.out.println(cal2 == cal3);
		System.out.println(cal2.equals(cal3));
	}
}