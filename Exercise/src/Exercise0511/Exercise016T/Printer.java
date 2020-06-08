package Exercise0511.Exercise016T;

public class Printer {
	//메소드 선언부에서 매개변수의 타입, 갯수, 순서가 다르면 오버로딩 가능
	void println(int x) {
		System.out.println(x);
	}

	void println(boolean x) {
		System.out.println(x);
	}

	void println(double x) {
		System.out.println(x);
	}

	void println(String x) {
		System.out.println(x);
	}
}