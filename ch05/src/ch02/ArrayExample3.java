package ch02;

public class ArrayExample3 {
	public static void main(String[] args) {
		int sum = 0;
		int scores[] = new int[6];
		// �迭�� �� ��ҿ� �� �Է�
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		//scores[3] = 20;
		scores[4] = 20;
		scores[5] = 20;
		// scores[6] = 20;<-������ �迭�� index���� (0~5)�� ����� ����
		// scores[-1] = 100;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+"����:"+scores[i]);
		}
		// �迭 ���� ������ index�� ����, index�� 0���� ����, ������ �迭�� ���� -1����
		// �迭�� ����(���� ������ ����) : length
		for (int i = 0; i < scores.length; i++)
			sum += scores[i];

		double avg = sum / scores.length;
		System.out.println("���: " + avg);
	}
}