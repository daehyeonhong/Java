package ch08.ch03;

public class LambdaMainExample {
	public static void main(String[] args) {
		// 무명 (anonymous interface)
		MyFuncionalInterface mi = new MyFuncionalInterface() {

			@Override
			public int sum(int x, int y) {
				return x + y;
			}
		};
		System.out.println(mi.sum(10, 20));
		MyFuncionalInterface mi2 = new MyClass();// promotion
		System.out.println(mi2.sum(10, 20));
		// 람다식
		// 대입되는 인터페이스의 타입을 자바가 알고 있음.
		// 인터페이스에는 추상 메소드가 오직 하나여야만 함.
		// =오른쪽 인터페이스 명과 메소드 명은 삭제,
		// 매개 변수의 타입 삭제 변수 명만 , 표시
		// ()->{} 화살표로 표시
		// {}안의 명령문이 하나면{}삭제 가능,return문도 삭제 가능
		MyFuncionalInterface mi3 = (x, y) -> x + y;
		System.out.println(mi3.sum(10, 20));
	}
}