package ch05;

/*intŸ���� �����͸� �����ϴ� ���̰� 3�� �迭�� �����
index��ȣ 0���� 10, ������ index��ȣ����  20�� �����ϰ�
index��ȣ0�� ����� ���� ������ index��ȣ�� ����� ���� ���� ����
index��ȣ 1�� �����ϰ�, ��ü �迭������ ����ϼ���.*/
public class ArrayExample28T {
	public static void main(String[] args) {
		int[] intArr = new int[3];
		intArr[0] = 10;
		intArr[2] = 20;
		intArr[1] = intArr[0] + intArr[2];

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}