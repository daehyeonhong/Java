package PxG0504.PxG001;

public class PxG001 {
	public static void main(String[] args) {
		int sum = 0;
		int max = 0;
		int[] intArray1 = { 23, 445, 67, sum, max };

		for (int i : intArray1) {
			sum += i;
			if (max < i) {
				max = i;
			}
		}
		for (int i : intArray1) {
			System.out.println(i);
		}
		System.out.println(max);
		System.out.println(sum);
	}
}