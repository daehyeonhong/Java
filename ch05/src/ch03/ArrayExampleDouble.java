package ch03;

//�ʱⰪ ������� �迭 ����
public class ArrayExampleDouble {
	public static void main(String[] args) {
		// doubleŸ�� �迭 ����
		// double�迭 ����� ���ÿ� doubleŸ�� �� ������� �ʱ�ȭ
		double[] doubleArray = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < doubleArray.length; i++)
			System.out.println(doubleArray[i]);

		// double�迭 ���� �� doubleŸ�� �� ������� �ʱ�ȭ
		doubleArray = new double[] { 6, 7, 8, 9, 10 };
		// �� ��� ���
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.println(doubleArray[i]);
		}
	}
}