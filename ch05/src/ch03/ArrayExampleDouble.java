package ch03;

//초기값 목록으로 배열 생성
public class ArrayExampleDouble {
	public static void main(String[] args) {
		// double타입 배열 선언
		// double배열 선언과 동시에 double타입 값 목록으로 초기화
		double[] doubleArray = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < doubleArray.length; i++)
			System.out.println(doubleArray[i]);

		// double배열 선언 후 double타입 값 목록으로 초기화
		doubleArray = new double[] { 6, 7, 8, 9, 10 };
		// 각 요소 출력
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.println(doubleArray[i]);
		}
	}
}