package DATE0429.PxG001;

public class Test001 {
	public static void main(String[] args) {
		System.out.println("매출현황");
		String[] head = { "제품명", "1월", "2월", "3월", "4월", "5월", "6월", "상반기 합계", "상반기 평균" };
		String[] name = { "냉장고", "Tv", "청소기" };
		String[] totalSumAvg = { "총계", "평균" };

		int amt[][] = { { 250, 170, 300, 780, 780, 250 }, { 170, 120, 150, 220, 250, 450 },
				{ 450, 230, 400, 250, 120, 230 } };
		double[][] lineSumAvg = new double[name.length][2];
		double[][] totalSumAvgAmt = new double[totalSumAvg.length][6];

		for (String is : head) {
			System.out.print(is + "\t");
		}
		System.out.println();
		System.out.println("========================================================================");

		for (int i = 0; i < amt.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < amt[i].length; j++) {
				System.out.print(amt[i][j] + "\t");
				lineSumAvg[i][0] += amt[i][j];
				lineSumAvg[i][1] = Math.round(lineSumAvg[i][0] / amt[i].length);
				totalSumAvgAmt[0][j] += amt[i][j];
				totalSumAvgAmt[1][j] = Math.round((double) totalSumAvgAmt[0][j] / name.length*10)/10;
			}
			System.out.println((int) lineSumAvg[i][0] + "\t" + (double) Math.round(lineSumAvg[i][1]) + "\t");
		}
		System.out.println("========================================================================");

		for (int i = 0; i < totalSumAvg.length; i++) {
			System.out.print(totalSumAvg[i] + "\t");
			if (i == 0) {
				for (int j = 0; j < totalSumAvgAmt[0].length; j++) {
					System.out.print((int) totalSumAvgAmt[0][j] + "\t");
				}
			} else {
				for (int j = 0; j < totalSumAvgAmt[1].length; j++) {
					System.out.print(Math.round((double) totalSumAvgAmt[1][j] * 10) / 10 + "\t");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < totalSumAvg.length; i++) {
			System.out.print(totalSumAvg[i] + "\t");
			for (int j = 0; j < totalSumAvgAmt[i].length; j++) {
				if (i == 0) {
					System.out.print((int) totalSumAvgAmt[i][j] + "\t");
				} else if (i == 1) {
					System.out.print(Math.round((double) totalSumAvgAmt[i][j] * 10) / 10 + "\t");
				}

			}
			System.out.println();
		}

		System.out.println((double) Math.round(33.33 * 10) / 10);
	}
}