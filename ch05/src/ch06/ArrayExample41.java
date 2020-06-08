package ch06;

public class ArrayExample41 {
	public static void main(String[] args) {
		int[][] arr1 = { { 10, 20, 30 }, { 10, 30 }, { 20 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}