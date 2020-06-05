package Class.R0507;

//this() 클래스 내의 생성자 호출 메소드
//주의사항-this() 메소드는 생성자의 첫 라인에 기술해야함.
public class A {
	A() {
		this("hello", "hi", 20);
		System.out.println("매개변수 없는 default 생성자");
	}

	A(String s) {
		System.out.println("매개변수 1개짜리 생성자 호출");
	}

	A(String s, String s2) {
		this(s);
		System.out.println("매개변수 2개짜리 생성자 호출");
	}

	A(String s, String s2, int i) {
		this(s, s2);
		System.out.println("매개변수 3개짜리 생성자 호출");
	}
}