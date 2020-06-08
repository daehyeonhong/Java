package ch06;

public class FuntionExam {
	double x = 50;
	double y = 45;

	// 두 실수(double)을 받아서 최댓값을 리턴하는 메소드
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

	// 두 실수(double)을 받아서 최댓값을 리턴하지 않고 출력하는 메소드
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

	// 두 실수 x,y 중 최댓값을 리턴하는 메소드
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

	// 두 실수 x, y 중 최댓값을 리턴하지 않고 출력하는 메소드
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