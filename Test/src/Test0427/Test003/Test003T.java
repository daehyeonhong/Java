package Test0427.Test003;

public class Test003T {
	public static void main(String[] args) {
		int count2 = 0;
		System.out.print("2���� 100������ ��� �Ҽ�:");
		for (int i = 2; i <= 100; i++) {
			count2 = 0;
			for (int k = 2; k < i; k++) {// k<1 : k=i-1
				if ((i % k) == 0) {
					count2++;// count2�� 0���� 1�� �ٲ��
					break;// ���� �ߴ�
				}
			}
			if (count2 == 0) {
				System.out.print(" " + i);
			}
		}
	}
}