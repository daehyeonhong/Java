package ch03;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[] intArray1 = { 1, 2, 3, 4, 5 };
		// intArray1[5] = 10;
		// System.out.println(intArray1[5]);
		// ������ Ȯ���� length���� ���� �Ұ�
		// intArray1.length = 10;
		int[] intArray2 = new int[intArray1.length + 5];// int[10]
		intArray2[intArray1.length] = 10;// inrArray2[5]
		System.out.println(intArray2[5]);

		// ���� �迭�� ���� ���� �迭�� ����
		for (int i = 0; i < intArray1.length; i++)
			intArray2[i] = intArray1[i];

		// intArray2 �迭�� �� ��Ұ� ���
		for (int i = 0; i < intArray2.length; i++)
			System.out.println(intArray2[i]);

		// �����߻�
		// intArray2=intArray1;

	}
}