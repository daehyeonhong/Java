package ch06;

public class FuntionExam {
	double x = 50;
	double y = 45;

	// �� �Ǽ�(double)�� �޾Ƽ� �ִ��� �����ϴ� �޼ҵ�
	double method1(double x, double y) {
		double[] arr = { x, y };
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// �� �Ǽ�(double)�� �޾Ƽ� �ִ��� �������� �ʰ� ����ϴ� �޼ҵ�
	void method2(double x, double y) {
		double[] arr = { x, y };
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	// �� �Ǽ� x,y �� �ִ��� �����ϴ� �޼ҵ�
	double method3() {
		double[] arr = { x, y };
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// �� �Ǽ� x, y �� �ִ��� �������� �ʰ� ����ϴ� �޼ҵ�
	void method4() {
		double[] arr = { x, y };
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}