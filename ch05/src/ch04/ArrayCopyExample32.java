package ch04;

//���� ����(deep copy)
public class ArrayCopyExample32 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[arr1.length];
		// ���ο� �迭 ��ü�� �����Ͽ� �� ��ҵ��� ���� ����
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// �迭�� ���� ��
		System.out.print("arr1�� ��: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("arr2�� ��: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		arr2[2] = 99;
		// �迭�� ���� ��
		System.out.print("arr1�� ��: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.print("arr2�� ��: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}