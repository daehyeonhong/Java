package ch02;

public class ArrayExampleDouble {
	public static void main(String[] args) {
		// ������ �迭�� �� ���(�Ӽ�)���� �������, doubleŸ���� �⺻ ��0
		double[] doubleArray = new double[5];
		for (int i = 0; i < doubleArray.length; i++)
			System.out.println(doubleArray[i]);
		// �迭�� �� ��ҿ� ������ index��ȣ�� ����
		doubleArray[0] = 10;
		doubleArray[1] = 20;
		doubleArray[2] = 30;
		// �迭�� �� ��� �� ���
		for (int i = 0; i < doubleArray.length; i++)
			System.out.println(doubleArray[i]);

		// doubleŸ���� �⺻ ���� ����� ��� ����
		double result = doubleArray[3] + 5;
		System.out.println("result:"+result);
	}
}