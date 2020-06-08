package ch14.ch03;

public class Computer {
	// �迭�� ���޵�.
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	// �Ű������� ���޵Ǵ� ���� ������ ���� ���������� �迭�� �����Ǿ� ���޵�.
	int sum2(int... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	// �޼ҵ��(Ÿ�� ... �迭 ����){���� ������ ���� �� �� Ÿ��[]�� �����Ǿ� ����}
	double calc(double... values) {
		double sum = 0;
		for (double d : values) {
			sum += d;
		}
		return sum;
	}
}