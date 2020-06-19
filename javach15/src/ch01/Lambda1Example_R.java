package ch01;

public class Lambda1Example_R {
	public static void main(String[] args) {
		// 구현체를 Promotion하여 대입
		// 익명클래스로 구현화
		MyFunctionalInterface mf1 = new MyFunctionalInterface() {

			@Override
			public void method() {
				System.out.println("함수적 인터페이스의 메소드.");
			}
		};
		mf1.method();

		// Lambda_Method가 argument가 없으면 '()' 표시
		MyFunctionalInterface mf2 = () -> System.out.println("함수적 인터페이스의 메소드.");
		mf2.method();
	}
}