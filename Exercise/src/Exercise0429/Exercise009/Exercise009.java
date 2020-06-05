package Exercise0429.Exercise009;

import java.util.Scanner;

public class Exercise009 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int count = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();
			int score = 0;

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					score = scanner.nextInt();
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				count = 0;
				for (int i : scores) {
					System.out.println("score[" + count + "]: " + i);
					count++;
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;

				for (int i : scores) {
					sum += i;
					if (max < i) {
						max = i;
					}
				}

				double avg = (double) sum / scores.length;

				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + (double) Math.round(avg * 10) / 10);
			} else if (selectNo == 5) {
				run = false;
			}

		} // while

		System.out.println("���α׷� ����");
		scanner.close();
	}
}