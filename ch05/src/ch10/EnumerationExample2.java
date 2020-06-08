package ch10;

import java.util.Calendar;//달력 정보를 가지고 있는 객체

public class EnumerationExample2 {
	public static void main(String[] args) {
		Week today = null;// 열거타입 변수 선언

		// Calendar는 new Calendar()로 생성하지 않음.
		// Calendar는 추상(abstract) 클래스라 new로 생성할 수 없음.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);// 4
		String day = null;
		System.out.println("week: " + week);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			day = "일요일";
			break;
		case 2:
			today = Week.MONDAY;
			day = "월요일";
			break;
		case 3:
			today = Week.TUESDAY;
			day = "화요일";
			break;
		case 4:
			today = Week.WEDNESDAY;
			day = "수요일";
			break;
		case 5:
			today = Week.THURSDAY;
			day = "목요일";
			break;
		case 6:
			today = Week.FRIDAY;
			day = "금요일";
			break;
		case 7:
			today = Week.SATURDAY;
			day = "토요일";
			break;
		}
		System.out.println("오늘 요일: " + today);
		System.out.println("오늘 요일: " + day);

		// 열거 상수 값 비교 == Week.상수값
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}