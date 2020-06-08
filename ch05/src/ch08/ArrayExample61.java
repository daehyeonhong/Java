package ch08;

public class ArrayExample61 {
	public static void main(String[] args) {
		int[][] num = new int[2][3];// 길이가 3인 1차원 배열 2개
		num[0][0] = 74; num[0][1] = 32; num[0][2] = 65;
		num[1][0] = 54; num[1][1] = 45; num[1][2] = 87;
		// 이중 for문

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

		for (int[] k1 : num) {
			for (int i : k1) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}