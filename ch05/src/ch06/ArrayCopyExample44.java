package ch06;

import java.util.Arrays;

public class ArrayCopyExample44 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[arr1.length];

		// �迭 ���� ���� = Arrays.capyOf(���迭, ����)
		arr2 = Arrays.copyOf(arr1, arr1.length);

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		int[] arr3 = Arrays.copyOfRange(arr1, 0, arr1.length);// 0<=����<5
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
	}
}