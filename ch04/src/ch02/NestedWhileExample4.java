package ch02;

public class NestedWhileExample4 {
	public static void main(String[] args) {
		int i = 1;//���۰� �ʱ�ȭ
		while (i <= 9) {//���������� ���� �񱳹�
			int j = 2;//���۰� �ʱ�ȭ
			while (j <= 9) {//���������� ���� �񱳹�
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");// �� �ٷ� ����
				j++;//������
			}
			System.out.println();//�� �� �Ʒ��� ������
			i++;//������
		}
	}
}