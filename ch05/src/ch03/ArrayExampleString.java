package ch03;

//초기값 목록으로 배열 생성
public class ArrayExampleString {
	public static void main(String[] args) {
		// String타입 배열 선언
		// String배열 선언과 동시에 String타입 값 목록으로 초기화
		String[] stringArray = { "hello", "hi", "bye", "oh", new String("hi") };

		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		// String배열 선언 후 String타입 값 목록으로 초기화
		stringArray = new String[] { "hey", "bye", "hello", new String("yes") };

		// 각 요소 출력
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}
}