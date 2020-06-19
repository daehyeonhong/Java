package ch08_01;

public interface MyInterface {
	void method1();

	default void method2() {
	}// default_method - 자바8 추가

	default void method3() {

	}

	static void staticMethod() {

	}// static 실체 메소드 - 자바8 추가
}