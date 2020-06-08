package ch14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMainExample {
	public static void main(String[] args) {
		Car car = new Car();
		Constructor[] cons = car.getClass().getDeclaredConstructors();
		Method[] methods = car.getClass().getMethods();
		Field[] fields = car.getClass().getFields();

		// ��Ű����. Ŭ������getName
		System.out.println(car.getClass().getName());
		// Ŭ������ getSimpleName
		System.out.println(car.getClass().getSimpleName());

		// ���� ���� �ν��Ͻ��� ������ ����
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}
		// ���� ���� �ν��Ͻ��� �޼ҵ� ����
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
	}
}