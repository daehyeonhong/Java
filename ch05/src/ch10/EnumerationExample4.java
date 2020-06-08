package ch10;

import java.util.Scanner;

public class EnumerationExample4 {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		// name() 메소드
		String name = today.name();// "SUNDAY"
		System.out.println(name);

		// ordinal() 메소드
		int ordinal = today.ordinal();// SUNDAY.ordinal
		System.out.println(ordinal);

		// compareTo() 메소드 - 두 열거상수간의 순서 차
		Week day1 = Week.MONDAY;// ordinal-0
		Week day2 = Week.WEDNESDAY;// ordinal-2
		int result1 = day1.compareTo(day2);
		System.out.println(day1.ordinal() - day2.ordinal());
		System.out.println(result1);

		if (day1.ordinal() - day2.ordinal() > 0) {
			System.out.println("day1이 day2보다 순서상으로 뒤에 있음");
		} else if (day1.ordinal() - day2.ordinal() < 0) {
			System.out.println("day1이 day2보다 순서상으로 앞에 있음");
		} else// day1.ordinal()-day2.ordinal()==0
		{
			System.out.println("day1과 day2는 순서상으로 같음");
		}
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		System.out.println(day2.ordinal() - day1.ordinal());

		// valueOf() 메소드 - 문자열로 입력 받은 값을 열거 상수로 변환하는 메소드
		Scanner scanner = new Scanner(System.in);
		System.out.println("요일을 영문대문자로 입력하세요.");
		String strDay = scanner.next();
		Week weekDay = Week.valueOf(strDay);
		if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말입니다.");
		} else {
			System.out.println("평일입니다.");
		}

		// values() 메소드
		// 열거타입 상수 배열
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}
}