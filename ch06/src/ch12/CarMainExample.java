package ch12;

import ch12.ch01.Car;

public class CarMainExample {
	// 동일한 이름의 클래스라도 패키지명이 다르면 다른 클래스로 처리
	public static void main(String[] args) {
		// 클래스의 전체명
		ch12.ch01.Car car1 = new ch12.ch01.Car();
		ch12.ch02.Car car2 = new ch12.ch02.Car();

		// import후의 클래스명
		Car car3 = new Car();// ch12.ch01.Car

		// 클래스의 전체명 출력
		// getClass().getName();
		System.out.println(car1.getClass().getName());
		System.out.println(car2.getClass().getName());
		System.out.println(car3.getClass().getName());

		System.out.println(car1.getClass().getName().equals(car2.getClass().getName()));
		System.out.println(car2.getClass().getName().equals(car3.getClass().getName()));
		System.out.println(car3.getClass().getName().equals(car1.getClass().getName()));
	}
}