package ch03;

//�ʱⰪ ������� �迭 ����
public class ArrayExampleInt {
	public static void main(String[] args) {
		// intŸ�� �迭 ����
		// int�迭 ����� ���ÿ� intŸ�� �� ������� �ʱ�ȭ
		int[] intArray = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);

		// int�迭 ���� �� intŸ�� �� ������� �ʱ�ȭ
		intArray = new int[] { 6, 7, 8, 9, 10 };
		// �� ��� ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}