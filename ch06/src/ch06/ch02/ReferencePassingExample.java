package ch06.ch02;

public class ReferencePassingExample {
	public static void main(String[] args) {
		// �迭 ��ü ����
		int[] arr = { 1, 2, 3, 4, 5 };
		// �迭 ���� �� arr�� �ּ� �� ����
		arrayMethod(arr);

		// �޼ҵ� ���� �� �� ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	// �Ű� ������ �ּ� ���� ����
	static void arrayMethod(int[] intArray) {
		intArray[2] = 99;
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "\t");
		}
		System.out.println();
	}
}