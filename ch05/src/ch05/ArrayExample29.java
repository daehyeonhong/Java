package ch05;

/*doubleŸ�� ���� 5�� �����ϴ� �迭�� �����
10.5, 20.3, 30.6, 40.5, 45.9�� ����
������ �հ� ����� ����Ͻÿ�.*/
public class ArrayExample29 {
	public static void main(String[] args) {
		double sum;

		double[] doubleArray = { 10.5, 20.3, 30.6, 40.5, 45.9 };

		sum = 0;
		for (int i = 0; i < doubleArray.length; i++) {
			sum += doubleArray[i];
		}

		System.out.println("��: " + sum);
		System.out.println("���: " + sum / doubleArray.length);
	}
}