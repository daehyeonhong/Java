package ch14.ch01;

public class Service {
	@PrintAnnotation // �� �� default, value = "-", number = 15
	public void method1() {
		System.out.println("���� ���� 1");
	}

	@PrintAnnotation("*") // value = "*", number = 15
	public void method2() {
		System.out.println("���� ���� 2");
	}

	@PrintAnnotation(value = "#", number = 20) // value = "#", number = 20
	public void method3() {
		System.out.println("���� ���� 3");
	}
}