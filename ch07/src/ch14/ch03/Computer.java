package ch14.ch03;

public class Computer {
	// 배열이 전달됨.
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	// 매개변수로 전달되는 값의 갯수에 따라 가변적으로 배열로 생성되어 전달됨.
	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	// 메소드명(타입 ... 배열 변수){실행 블럭으로 전달 될 때 타입[]로 생성되어 전달}
	double calc(double... values) {
		double sum = 0;
		for (double d : values) {
			sum += d;
		}
		return sum;
	}
}