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

		for (int i = 0; i < scores.length; i++) {// 2���� �迭�� ���� �� 2���� �迭��.length
			for (int j = 0; j < scores[i].length; j++) {// �� ���� 1���� �迭�� ��� ���� 2���� �迭��[�� ��ȣ].length
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
	}
}