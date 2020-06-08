package ch12;

import ch12.ch01.Car;

public class CarMainExample {
	// ������ �̸��� Ŭ������ ��Ű������ �ٸ��� �ٸ� Ŭ������ ó��
	public static void main(String[] args) {
		// Ŭ������ ��ü��
		ch12.ch01.Car car1 = new ch12.ch01.Car();
		ch12.ch02.Car car2 = new ch12.ch02.Car();

		// import���� Ŭ������
		Car car3 = new Car();// ch12.ch01.Car

		// Ŭ������ ��ü�� ���
		// getClass().getName();
		System.out.println(car1.getClass().getName());
		System.out.println(car2.getClass().getName());
		System.out.println(car3.getClass().getName());

		System.out.println(car1.getClass().getName().equals(car2.getClass().getName()));
		System.out.println(car2.getClass().getName().equals(car3.getClass().getName()));
		System.out.println(car3.getClass().getName().equals(car1.getClass().getName()));
	}
}