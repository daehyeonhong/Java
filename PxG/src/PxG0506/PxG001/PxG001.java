package PxG0506.PxG001;

/*������Ȳ
��ǰ��    1��    2��    3��    4��    5��    6�� ��ݱ� �հ� ���
--------------------------------------------------------------------
�����    250    170    300    780    780    250
�׷���    170    120    150    220    250    450
û�ұ�    450    230    400    250    120    230
--------------------------------------------------------------------
�Ѱ�    870    520    850    1250    3490    872.5
���    290    173    283    416    1163    290.8*/
public class PxG001 {
	public static void main(String[] args) {

		String[] title = { "1��", "2��", "3��", "4��", "5��", "6��", "��ݱ� �հ�", "���" };
		String[] name = { "�����", "Tv", "û�ұ�" };

		int[][] salesStatus = { { 250, 170, 300, 780, 780, 250 }, { 170, 120, 150, 220, 250, 450 },
				{ 450, 230, 400, 250, 120, 230 } };
		int[][] lineSum = new int[salesStatus.length][1];
		double[][] lineAvg = new double[salesStatus.length][1];
		int[] totalSum = new int[title.length - 2];
		double[] totalAvg = new double[totalSum.length];

		System.out.println("\t\t\t\t������Ȳ");
		System.out.print("��ǰ��\t");

		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}

		System.out.println();
		System.out.println("-------------------------------------------------------------------");

		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < salesStatus[i].length; j++) {
				System.out.print(salesStatus[i][j] + "\t");
				lineSum[i][0] += salesStatus[i][j];
				lineAvg[i][0] = (double) lineSum[i][0] / salesStatus[i].length;
				totalSum[j] += salesStatus[i][j];
				totalAvg[j] = Math.round((double) totalSum[j] / name.length * 10) / 10;
			}
			System.out.println((double) Math.round(lineSum[i][0] / salesStatus[i].length * 10) / 10);
			System.out.println(lineSum[i][0] + "\t" + (double) Math.round((lineAvg[i][0] * 10) / 10) + "\t");
		}
		System.out.println("-------------------------------------------------------------------");

		System.out.print("�Ѱ�\t");
		for (int i : totalSum) {
			System.out.print(i + "\t");
		}

		System.out.println();

		System.out.print("���\t");
		for (double d : totalAvg) {
			System.out.print(d + "\t");
		}
	}
}