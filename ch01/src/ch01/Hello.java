package ch01;

public class Hello {// 클래스 블럭, 클래스명은 대문자로 시작

	public static void main(String[] args) {// 메소드 블럭
		hello();// 동일 클래스내에서 다른 함수 (메소드) 호출
		System.out.println("Hello, JavaWorld");// 실행문(명령문)

	}

	public static void hello() {// 메소드명은 소문자로
		String hello = "hello";// 변수명은 소문자로
		System.out.println(hello);
	}
}
