package ch05;

/*intŸ���� �����͸� �����ϴ� ���̰� 3�� �迭�� �����
index��ȣ 0���� 10, ������ index��ȣ����  20�� �����ϰ�
index��ȣ0�� ����� ���� ������ index��ȣ�� ����� ���� ���� ����
index��ȣ 1�� �����ϰ�, ��ü �迭������ ����ϼ���.*/
public class ArrayExample28 {
	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = 10;
		intArray[intArray.length - 1] = 20;
		intArray[1] = intArray[0] + intArray[intArray.length - 1];

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}