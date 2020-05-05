package Test0429.Test001;

/*������Ȳ
��ǰ��    1��    2��    3��    4��    5��    6�� ��ݱ� �հ� ���
--------------------------------------------------------------------
�����    250    170    300    780    780    250
�׷���    170    120    150    220    250    450
û�ұ�    450    230    400    250    120    230
--------------------------------------------------------------------
�Ѱ�    870    520    850    1250    3490    872.5
���    290    173    283    416    1163    290.8*/
public class Test001T {
	public static void main(String[] args) {
		System.out.println("\t\t\t\t���� ��Ȳ");
		System.out.print("��ǰ��\t");
		String[] title = { "1��", "2��", "3��", "4��", "5��", "6��", "��ݱ� �հ�", "��ݱ� ���" };
		String[] name = { "�����", "TV", "û�ұ�" };

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
		System.out.print("�Ѱ�\t");
		for (int k : totalSum) {
			System.out.print(k + "\t");
		}
		System.out.print(aggregate + "\t" + totalAverage);
	}
}