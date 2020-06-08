package ch08.ch01;

//인터페이스
//메소드 규격을 추상화 하여 묶어 놓은 객체
public interface MyInterface {
	// 상수
	double PI = 3.141592;// public static final이 생략

	// 추상 메소드
	void method1();// public abstract가 생략 됨
}

class MyClass implements MyInterface {

	@Override
	public void method1() {
		System.out.println("method");
	}
}