package ch03;

//초기값 목록으로 배열 생성
public class ArrayExampleInt {
	public static void main(String[] args) {
		// int타입 배열 선언
		// int배열 선언과 동시에 int타입 값 목록으로 초기화
		int[] intArray = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);

		// int배열 선언 후 int타입 값 목록으로 초기화
		intArray = new int[] { 6, 7, 8, 9, 10 };
		// 각 요소 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}