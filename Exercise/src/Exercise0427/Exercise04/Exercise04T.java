package Exercise0427.Exercise04;

//4. while���� Math.random()�޼ҵ带 �̿��ؼ� �ֻ��� �� ���
//�� ���� ���� 5�̸� ����
public class Exercise04T {
	public static void main(String[] args) {
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int sum = dice1 + dice2;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			if (sum == 5)
				break;
		}
	}
}