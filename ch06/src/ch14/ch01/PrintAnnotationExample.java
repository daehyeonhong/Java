package ch14.ch01;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// Service 클래스로부터 메소드 정보 얻기
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for (Method m : declaredMethods) {
			System.out.println(m);
		}
		// method 객체를 하나씩 처리
		for (Method method : declaredMethods) {
			// 어노테이션이 적용이 됐으면 true
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// 해당 어노테이션 정보를 얻어와서 PrintAnnotation에 저장
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				// PrintAnnotation의 number()만큼, value()를 실행
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());// "-"
				}
				System.out.println();

				try {
					// 메소드 호출 invoke();
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}
}