package ch06;

public class FuntionExamT {
	double x;
	double y;

	// �� �Ǽ�(double)�� �޾Ƽ� �ִ��� �����ϴ� �޼ҵ�
	double method1(double x, double y) {
		// return x > y ? x : y;
		double result;
		if (x > y) {
			result = x;
		} else {
			result = y;
		}
		return result;
	}

	// �� �Ǽ�(double)�� �޾Ƽ� �ִ��� �������� �ʰ� ����ϴ� �޼ҵ�
	void method2(double x, double y) {
		System.out.println(x > y ? x : y);
	}

	// �� �Ǽ� x,y �� �ִ��� �����ϴ� �޼ҵ�
	double method3() {
		return x > y ? x : y;
	}

	// �� �Ǽ� x, y �� �ִ��� �������� �ʰ� ����ϴ� �޼ҵ�
	void method4() {
		System.out.println(x > y ? x : y);
	}
}