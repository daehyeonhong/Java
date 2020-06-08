package ch06.ch02;

public class ReferencePassingExample2 {
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
		// 새로운 배열 생성
		int[] arr2 = new int[intArray.length];
		// 배열의 각 요소 복사
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = intArray[i];
		}

		// 새로운 배열의 요소 값 수정
		arr2[2] = 99;
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
	}
}