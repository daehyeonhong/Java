package ch04;

//깊은 복사(deep copy)
public class ArrayCopyExample32 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[arr1.length];
		// 새로운 배열 객체를 생성하여 각 요소들의 값을 복사
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// 배열값 변경 전
		System.out.print("arr1의 값: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("arr2의 값: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		arr2[2] = 99;
		// 배열값 변경 후
		System.out.print("arr1의 값: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("arr2의 값: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}