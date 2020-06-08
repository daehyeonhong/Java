package ch05.ch02;

public class A {
	private int a;// 상속 제외 - 자식 클래스에서 접근 불가능
	int b;// 상속 가능 - 자식 클래스에서 접근 가능

	private void method1() {// 상속 제외
		a = 10;
		System.out.println(a);
	}

	public void method2() {// 상속 가능
		method1();
	}
}

class B extends A{
	
}