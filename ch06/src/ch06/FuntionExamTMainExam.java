package ch06;

public class FuntionExamTMainExam {
	public static void main(String[] args) {
		FuntionExamT fe = new FuntionExamT();

		// �Ű� ���� �ް� ���� Ÿ�� �ִ� �޼ҵ� ȣ��
		double result = fe.method1(10, 20);
		System.out.println(result);
		
		// �Ű� ���� �ް� ���� Ÿ�� ���� �޼ҵ� ȣ��
		fe.method2(10, 20);

		
		fe.x = 20;
		fe.y = 30;
		// �Ű� ���� ���� �ʰ� ���� Ÿ�� �ִ� �޼ҵ� ȣ��
		result = fe.method3();
		System.out.println(result);

		// �Ű� ���� ���� �ʰ� ���� Ÿ�� ���� �޼ҵ� ȣ��
		fe.method4();
	}
}
