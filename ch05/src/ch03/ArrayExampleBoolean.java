package ch03;

//초기값 목록으로 배열 생성
public class ArrayExampleBoolean {
	public static void main(String[] args) {
		// boolean타입 배열 선언
		// boolean배열 선언과 동시에 boolean타입 값 목록으로 초기화
		boolean[] booleanArray = { true, false, false, true, 10 > 1 };

		for (int i = 0; i < booleanArray.length; i++)
			System.out.println(booleanArray[i]);

		// boolean배열 선언 후 boolean타입 값 목록으로 초기화
		booleanArray = new boolean[] { 10 != 1, false, true, 10 / 2 != 0, true };
		// 각 요소 출력
		for (int i = 0; i < booleanArray.length; i++) {
			System.out.println(booleanArray[i]);
		}
	}
}