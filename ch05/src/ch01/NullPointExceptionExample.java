package ch01;

public class NullPointExceptionExample {
	public static void main(String[] args) {
		// Ÿ��[] ����;
		int[] intArray = null;
		// intArray[0] = 10;
		// �迭 ����
		// �迭 ���� ���� = new Ÿ��[�迭 ����];
		intArray = new int[5];
		// �迭�� �� �ε��� ��ġ�� �� ����
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
		// �迭�� Ư�� index ��ġ�� �� ���
		System.out.println(intArray[2]);
		// ������ �迭�� ���� length�� ������ �ʱ�ȭ�ǰ� �ٲ� �� ����.
		System.out.println(intArray.length);
		// intArray.length=10;
	}
}