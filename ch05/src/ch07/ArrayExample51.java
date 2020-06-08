package ch07;

public class ArrayExample51 {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 향상된 for문
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}