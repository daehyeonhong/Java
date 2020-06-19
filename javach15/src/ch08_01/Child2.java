package ch08_01;

public class Child2 implements MyInterface {

	@Override
	public void method1() {
		System.out.println("Child2에서 재정의 된 메소드1");
	}

	@Override
	public void method2() {
		System.out.println("Child2에서 재정의 된 메소드2");
	}

	/*
	 * @Override public void method3() {
	 * 
	 * }
	 */

}