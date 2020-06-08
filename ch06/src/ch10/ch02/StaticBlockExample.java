package ch10.ch02;

public class StaticBlockExample {
	// 인스턴스 멤버
	int field1;

	void method1() {

	}

	// static 멤버
	static int field2;

	static void method2() {

	}

	// static 초기화 블럭
	static {
		// field1 = 10;static 초기화 불럭에는 인스턴스 멤버는 올 수 없음
		// method1();static 초기화 불럭에는 인스턴스 멤버는 올 수 없음
		field2 = 10;
		method2();
	}

	// static 메소드
	static void method3() {
		// this.feild1 = 10; static 멤버에는 인스턴스를 가리키는 this가 올 수 없음
		// this.method1(); static 멤버에는 인스턴스를 가리키는 this가 올 수 없음
		field2 = 10;
		method2();
	}
}