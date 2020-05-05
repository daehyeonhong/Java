package Test0429.Test001;

/*매출현황
제품명    1월    2월    3월    4월    5월    6월 상반기 합계 평균
--------------------------------------------------------------------
냉장고    250    170    300    780    780    250
테레비    170    120    150    220    250    450
청소기    450    230    400    250    120    230
--------------------------------------------------------------------
총계    870    520    850    1250    3490    872.5
평균    290    173    283    416    1163    290.8*/
public class Test001 {
	public static void main(String[] args) {
		System.out.println("\t\t\t\t매출 현황");
		System.out.println("======================================================================");
		String[] title = { "제품명", "1월", "2월", "3월", "4월", "5월", "6월", "상반기 합계", "평균" };
		String[] name = { "냉장고", "Tv", "청소기" };

		int[][] salesStatus = { { 250, 170, 300, 780, 780, 250 }, { 170, 120, 150, 220, 250, 450 },
				{ 450, 230, 400, 250, 120, 230 } };
		int[] totalSum = new int[salesStatus[0].length];
		int sum;
		int count;
		int aggregate = 0;
		int totalCount = 0;
		double avg;
		double totalAvg;

		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < salesStatus.length; i++) {
			sum = 0;
			count = 0;
			avg = 0;
			System.out.print(name[i] + "\t");

			for (int j = 0; j < salesStatus[i].length; j++) {
				System.out.print(salesStatus[i][j] + "\t");
				sum += salesStatus[i][j];
				totalSum[j] += salesStatus[i][j];
				totalCount++;
				count++;
				aggregate += salesStatus[i][j];
			}
			avg = (double) sum / count;
			System.out.print(sum + "\t");
			System.out.print((double) Math.round(avg * 10) / 10 + "\t");
			System.out.println();
		}

		System.out.println("======================================================================");
		System.out.print("총계" + "\t");

		for (int i = 0; i < totalSum.length; i++) {
			System.out.print(totalSum[i] + "\t");
		}
		System.out.println(aggregate);
		System.out.print("평균" + "\t");

		for (int i = 0; i < totalSum.length; i++) {
			totalAvg = 0;
			totalAvg = (double) totalSum[i] / name.length;
			System.out.print((double) Math.round(totalAvg * 10) / 10 + "\t");
		}
		System.out.println((double) Math.round(aggregate / totalCount * 10) / 10);
	}
}