package ch02;

public class ArrayExampleString {
	public static void main(String[] args) {

		// ������ �迭�� �� ���(�Ӽ�)���� �������, StringŸ���� �⺻ ��false
		String[] stringArray = new String[5];
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		// �迭�� �� ��ҿ� ������ index��ȣ�� ����
		stringArray[0] = "hello";
		stringArray[1] = "hi";
		stringArray[2] = new String("hello");

		// �迭�� �� ��� �� ���
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		// ���� ������ ���ԵǴ� index ��ȣ�� null���� �ָ� ��ü�� ������ ������
		stringArray[0] = null;
		for (int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);

		String result = stringArray[3] + "ȫ�浿";
		System.out.println("result:" + result);

		// ���� �߻�

		// ���� Ÿ���� ����� ����� ���� null�̹Ƿ� ���� ��ü�� ����.
		// System.out.println("length:"+stringArray[3].length());

		// ���� Ÿ���� ����� ����� ���� null�̹Ƿ� ���� ��ü�� ����.-�� �Ұ�
		// System.out.println("result:" + stringArray[3].equals("ȫ�浿"));
	}
}