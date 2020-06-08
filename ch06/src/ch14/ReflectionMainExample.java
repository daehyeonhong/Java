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

		// 패키지명. 클래스명getName
		System.out.println(car.getClass().getName());
		// 클래스면 getSimpleName
		System.out.println(car.getClass().getSimpleName());

		// 실행 중인 인스턴스의 생성자 정보
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}
		// 실행 중인 인스턴스의 메소드 정보
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
	}
}