package ch06;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();

		int[] arr3 = new int[arr1.length];

		System.arraycopy(arr1, 1, arr3, 2, arr2.length - 2);
		System.out.print("arr3: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();
	}
}