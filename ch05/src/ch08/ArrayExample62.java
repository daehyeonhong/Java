package ch08;

public class ArrayExample62 {
	public static void main(String[] args) {
		int[][] s = new int[][] { { 54, 76, 32 }, { 54, 32, 65, 87 }, { 2, 9 } };

		for (int[] s1 : s) {
			for (int s2 : s1) {
				System.out.print(s2 + " ");
			}
			System.out.println();
		}
	}
}