package ch03;

//�ʱⰪ ������� �迭 ����
public class ArrayExampleBoolean {
	public static void main(String[] args) {
		// booleanŸ�� �迭 ����
		// boolean�迭 ����� ���ÿ� booleanŸ�� �� ������� �ʱ�ȭ
		boolean[] booleanArray = { true, false, false, true, 10 > 1 };

		for (int i = 0; i < booleanArray.length; i++)
			System.out.println(booleanArray[i]);

		// boolean�迭 ���� �� booleanŸ�� �� ������� �ʱ�ȭ
		booleanArray = new boolean[] { 10 != 1, false, true, 10 / 2 != 0, true };
		// �� ��� ���
		for (int i = 0; i < booleanArray.length; i++) {
			System.out.println(booleanArray[i]);
		}
	}
}