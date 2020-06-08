package ch14.ch01;

public class Service {
	@PrintAnnotation // 둘 다 default, value = "-", number = 15
	public void method1() {
		System.out.println("실행 내용 1");
	}

	@PrintAnnotation("*") // value = "*", number = 15
	public void method2() {
		System.out.println("실행 내용 2");
	}

	@PrintAnnotation(value = "#", number = 20) // value = "#", number = 20
	public void method3() {
		System.out.println("실행 내용 3");
	}
}