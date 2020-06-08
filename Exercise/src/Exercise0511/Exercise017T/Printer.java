package Exercise0511.Exercise017T;

public class Printer {
	// 메소드 선언부에서 매개변수의 타입, 갯수, 순서가 다르면 오버로딩 가능
	static void println(int x) {
		System.out.println(x);
	}

	static void println(boolean x) {
		System.out.println(x);
	}

	static void println(double x) {
		System.out.println(x);
	}

	static void println(String x) {
		System.out.println(x);
	}
}