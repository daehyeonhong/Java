package ch09;

public class ArrayExample74 {
	public static void main(String[] args) {
		int sum = 0, j = 0;
		int[] tot = new int[4];
		System.out.println("���� ��Ȳ\t");
		String[] head = { "��ǰ��", "1��", "2��", "3��", "4��", "�հ�", "���" };
		String[] name = { "�����", "�׷���", "û�ұ�" };
		int[][] amt = { { 250, 170, 300, 780 }, { 170, 120, 150, 220 }, { 450, 230, 400, 250 } };

		for (String h : head) {
			System.out.print(h + "\t");
		}
		System.out.println("\n===================================================");
		for (int i = 0; i < amt.length; i++) {
			System.out.print(name[i] + "\t");
			for (j = 0; j < amt[i].length; j++) {
				System.out.print(amt[i][j] + "\t");
				sum += amt[i][j];
				tot[j] += amt[i][j];
			}
			System.out.println(sum + "\t" + (double) sum / amt[i].length);
			sum = 0;
		}
		System.out.println("\n===================================================");
		System.out.print("�Ѱ�\t");
		for (j = 0; j < tot.length; j++) {
			System.out.print(tot[j] + "\t");
			sum += tot[j];
		}
		System.out.println(sum + "\t" + (double) sum / tot.length);
		System.out.print("���\t");
		for (j = 0; j < tot.length; j++) {
			System.out.print(tot[j] / name.length + "\t");

		}
		System.out.println(sum / name.length + "\t" + (double) sum / tot.length / name.length);
	}
}