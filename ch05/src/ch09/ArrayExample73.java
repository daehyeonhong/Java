package ch09;

public class ArrayExample73 {
	public static void main(String[] args) {
		String title = "\t\t      ����ǥ";
		String[] head = { "�̸�", "����", "����", "����", "����", "���" };
		System.out.print(title);
		System.out.println("\n============================================");
		int sum = 0;
		int[] tot = new int[3];// �� ���� �հ踦 �����ϴ� �迭
		String[] name = { "����Ÿ", "����", "���ǿ�", "�̽�����" };

		int[][] score = { { 90, 80, 70 }, { 76, 86, 90 }, { 90, 78, 90 }, { 80, 65, 87 } };

		for (String h : head) {
			System.out.print(h + "\t");
		}
		System.out.println("\n============================================");

		for (int i = 0; i < score.length; i++) {

			System.out.print(name[i] + "\t");

			for (int j = 0; j < score[j].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot[j] += score[i][j];
			}
			System.out.println(sum + "\t" + (int) sum / score[i].length);
			sum = 0;
		}
		System.out.println("============================================");
		System.out.print("�հ�\t");
		for (int i = 0; i < tot.length; i++) {
			System.out.print(tot[i] + "\t");
			sum += tot[i];
		}
		System.out.print(sum + "\t");
		System.out.print(Math.round(sum) / (score.length * score[0].length));
	}// main()��.
}