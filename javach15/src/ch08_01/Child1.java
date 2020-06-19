package ch08_01;

public class Child1 implements MyInterface {

	@Override
	public void method1() {
		System.out.println("Child1에서 재정의 된 메소드1");
	}

	/*
	 * @Override public void method2() {
	 * 
	 * }
	 */

	@Override
	public void method3() {
		System.out.println("Child1에서 재정의 된 메소드3");
	}

}