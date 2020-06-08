package Exercise0429.Exercise009;

import java.util.Scanner;

//Ű����κ��� �Է� ���� �л����� �ְ� ���� �� ���
public class Exercise009T {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.�л��� | 2.���� �Է� | 3.���� ����Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			try {
				if (selectNo == 1) {
					System.out.print("�л���> ");
					studentNum = scanner.nextInt();// �迭�� ���� �Է� �ޱ�
					scores = new int[studentNum];// ���̸�ŭ�� �迭 ����
				} else if (selectNo == 2) {
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]: ");
						scores[i] = scanner.nextInt();
					}
				} else if (selectNo == 3) {
					for (int s : scores) {
						System.out.print(s + "\t");
					}
					System.out.println();
				} else if (selectNo == 4) {
					int temp = 0;
					int sum = 0;
					for (int i = 0; i < scores.length; i++) {
						for (int j = i + 1; j < scores.length; j++)
							if (scores[i] > scores[j]) {
								temp = scores[i];
								scores[i] = scores[j];
								scores[j] = temp;
							} // ���� for��
						sum += scores[i];
						System.out.println("sum: " + sum);
					} // �ٱ��� for��
					System.out.println("�ְ�����: " + scores[scores.length - 1]);
					System.out.println("�������: " + (double) sum / scores.length);
				} else if (selectNo == 5) {
					run = !run;
				}
			} catch (NullPointerException e) {
				System.out.println("�л� ���� ���� �Է��ϼ���.");
				continue;
			}
		} // while�� ��
		System.out.println("���α׷� ����");
		scanner.close();
	}
}