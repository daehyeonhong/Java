package ch14.ch01;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		// Service Ŭ�����κ��� �޼ҵ� ���� ���
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for (Method m : declaredMethods) {
			System.out.println(m);
		}
		// method ��ü�� �ϳ��� ó��
		for (Method method : declaredMethods) {
			// ������̼��� ������ ������ true
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// �ش� ������̼� ������ ���ͼ� PrintAnnotation�� ����
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				// �޼ҵ� �̸� ���
				System.out.println("[" + method.getName() + "]");
				// PrintAnnotation�� number()��ŭ, value()�� ����
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());// "-"
				}
				System.out.println();

				try {
					// �޼ҵ� ȣ�� invoke();
					method.invoke(new Service());
				} catch (Exception e) {
					System.out.println();
				}
			}
		}
	}
}