package ch06;

public class ArrayExample42 {
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 70;
		scores[0][1] = 80;
		scores[0][2] = 90;

		scores[1][0] = 80;
		scores[1][1] = 70;
		scores[1][2] = 90;

		for (int i = 0; i < scores.length; i++) {// 2차원 배열의 행의 수 2차원 배열명.length
			for (int j = 0; j < scores[i].length; j++) {// 각 행의 1차원 배열의 요소 갯수 2차언 배열명[행 번호].length
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
	}
}