package ch06.ch02;

//�⺻ Ÿ���� ���� �޼ҵ��� �Ű������� ���޵� �� ���� ����Ǿ� ����.(���� ����)
public class ValuePassingExample {
	public static void main(String[] args) {
		int n = 10;
		// n�� �� 10�� ����Ǿ� increase �Լ��� �Ű������� ���� ��.
		increse(n);

		System.out.println("n: " + n);
	}

	// �Ű� ����(����,�μ�,arqument)�� �ް� ���� �������� �ʴ� �޼ҵ�
	static void increse(int m) {
		m = m + 1;
		System.out.println("m: " + m);
	}
}