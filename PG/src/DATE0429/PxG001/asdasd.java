package DATE0429.PxG001;

public class asdasd {
	public static void main(String[] args) {
		double[] doubleArr = { 1.3, 2.44, 5.8 };
		for (double d : doubleArr) {
			System.out.println((double) Math.round(d * 10) / 10);
		}

		int[] intArr = { 3, 3, 4 };
		double[] doubleArr1 = { 0 };
		for (int i : intArr) {
			doubleArr1[0] += i;
		}

		doubleArr1[0] = doubleArr1[0] / intArr.length;
		System.out.println((double) Math.round(doubleArr1[0] * 10) / 10);

		int[] intArr2 = { 5, 4, 6, 2, 7, 8, 2 };
		double[] doubleArr2 = new double[0];
		int count = 0;
		for (int i : intArr2) {
			doubleArr2[0] += i;
			count++;
		}
		System.out.println((double) doubleArr2[0] / count);

	}
}