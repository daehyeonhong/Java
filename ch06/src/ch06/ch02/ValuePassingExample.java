package ch06.ch02;

//기본 타입의 값이 메소드의 매개값으로 전달될 땐 값이 복사되어 전달.(깊은 복사)
public class ValuePassingExample {
	public static void main(String[] args) {
		int n = 10;
		// n의 값 10은 복사되어 increase 함수의 매개값으로 전달 됨.
		increse(n);

		System.out.println("n: " + n);
	}

	// 매개 변수(인자,인수,arqument)를 받고 값을 리턴하지 않는 메소드
	static void increse(int m) {
		m = m + 1;
		System.out.println("m: " + m);
	}
}