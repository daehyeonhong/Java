package ch09;

public class ArrayExample72 {
	public static void main(String[] args) {
		String title = "                                           ����ǥ";
		String[] head = { "�̸�", "����", "����", "����", "����", "���" };
		System.out.print(title);
		System.out.println("\n============================================");

		String[] name = { "����Ÿ", "����", "���ǿ�", "�̽�����" };
		
		int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 80, 65, 87 } };

		for (String h : head) {
			System.out.print(h + "\t");
		}
		System.out.println("\n============================================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[j].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.println(sum + "\t" + (int) sum / score[i].length);
		}
		System.out.println("\n============================================");
	}
}