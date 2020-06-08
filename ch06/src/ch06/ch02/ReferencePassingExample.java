package ch06.ch02;

public class ReferencePassingExample {
	public static void main(String[] args) {
		// 배열 객체 생성
		int[] arr = { 1, 2, 3, 4, 5 };
		// 배열 참조 값 arr의 주소 값 전달
		arrayMethod(arr);

		// 메소드 실핼 후 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	// 매개 변수로 주소 값을 받음
	static void arrayMethod(int[] intArray) {
		intArray[2] = 99;
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		System.out.println();
	}
}