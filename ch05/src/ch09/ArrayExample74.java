package ch09;

public class ArrayExample74 {
	public static void main(String[] args) {
		int sum = 0, j = 0;
		int[] tot = new int[4];
		System.out.println("매출 현황\t");
		String[] head = { "제품명", "1월", "2월", "3월", "4월", "합계", "평균" };
		String[] name = { "냉장고", "테레비", "청소기" };
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
		System.out.print("총계\t");
		for (j = 0; j < tot.length; j++) {
			System.out.print(tot[j] + "\t");
			sum += tot[j];
		}
		System.out.println(sum + "\t" + (double) sum / tot.length);
		System.out.print("평균\t");
		for (j = 0; j < tot.length; j++) {
			System.out.print(tot[j] / name.length + "\t");

		}
		System.out.println(sum / name.length + "\t" + (double) sum / tot.length / name.length);
	}
}