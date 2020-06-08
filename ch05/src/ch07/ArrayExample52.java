package ch07;

public class ArrayExample52 {
	public static void main(String[] args) {
		double[] arr1 = { 10.0, 15.2, 16.3, 17.4, 20.0 };
		double max = 0.0, min = 100.0;
		double sum = 0;

		// 향상된 for문
		for (double d : arr1) {
			sum += d;

			if (max < d) {
				max = d;

			}

			if (min > d) {
				min = d;
			}
		}
		System.out.println("총합:" + sum);
		System.out.println("평균:" + sum / arr1.length);

		System.out.println("최대값:" + max + ", 최소값:" + min);
	}
}