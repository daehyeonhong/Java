package ch02;

public class ArrayExampleBoolean {
	public static void main(String[] args) {
		// ������ �迭�� �� ���(�Ӽ�)���� �������, booleanŸ���� �⺻ ��false
		boolean[] booleanArray = new boolean[5];
		for (int i = 0; i < booleanArray.length; i++)
			System.out.println(booleanArray[i]);
		// �迭�� �� ��ҿ� ������ index��ȣ�� ����
		booleanArray[0] = false;
		booleanArray[1] = true;
		boolean booleanVar = 10>1;
		booleanArray[2] = 10>1;
		// �迭�� �� ��� �� ���
		for (int i = 0; i < booleanArray.length; i++)
			System.out.println(booleanArray[i]);
		System.out.println(booleanVar);

		Boolean result = booleanArray[3];
		System.out.println(""+result);
	}
}