package ch02;
//for���� �̿��Ͽ� 1���� 10���� ������ ǥ���ϰ� ���� ���ϴ� ����
public class ForExample6 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10; i >= 0; i--) {
			sum=i;//sum = sum+1;
			System.out.print(i);

			if (i>1) System.out.print("+");//�� �ٷ� �̾ ��� print();
			else {
				System.out.print("=");
				System.out.print(sum);//��� �� ���� �ٷ� �̵� println();
			}
		}//for�� ��.
	}
}