package ch03;

//�ʱⰪ ������� �迭 ����
public class ArrayExampleString {
	public static void main(String[] args) {
		// StringŸ�� �迭 ����
		// String�迭 ����� ���ÿ� StringŸ�� �� ������� �ʱ�ȭ
		String[] stringArray = { "hello", "hi", "bye", "oh", new String("hi") };

		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		// String�迭 ���� �� StringŸ�� �� ������� �ʱ�ȭ
		stringArray = new String[] { "hey", "bye", "hello", new String("yes") };

		// �� ��� ���
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}
}