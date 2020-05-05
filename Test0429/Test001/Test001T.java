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
public class Test001T {
	public static void main(String[] args) {
		System.out.println("\t\t\t\t매출 현황");
		System.out.print("제품명\t");
		String[] title = { "1월", "2월", "3월", "4월", "5월", "6월", "상반기 합계", "상반기 평균" };
		String[] name = { "냉장고", "TV", "청소기" };

		int[][] salesStatus = { { 250, 170, 300, 780, 780, 250 }, { 170, 120, 150, 220, 250, 450 },
				{ 450, 230, 400, 250, 120, 230 } };
		int[] totalSum = new int[6];

		int sum = 0;
		int i = 0;
		int j = 0;
		int aggregate = 0;
		int count = 0;
		double totalAverage = 0.0;

		for (String s1 : title) {
			System.out.print(s1 + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------------------");

		for (i = 0; i < salesStatus.length; i++) {
			System.out.print(name[i] + "\t");
			sum = 0;
			for (j = 0; j < salesStatus[i].length; j++) {
				System.out.print(salesStatus[i][j] + "\t");
				sum += salesStatus[i][j];
				totalSum[j] += salesStatus[i][j];
				count++;
			}
			aggregate += sum;
			System.out.println(sum + "\t" + sum / j);
		}

		totalAverage = aggregate / count;

		System.out.println("------------------------------------------------------------------------");
		System.out.print("총계\t");
		for (int k : totalSum) {
			System.out.print(k + "\t");
		}
		System.out.print(aggregate + "\t" + totalAverage);
	}
}