package ch02;
//for(�ʱⰪ;������;����){���๮;}
public class ForExample1 {
	public static void main(String[] args) {
		//1~100������ ������ ���� ����� ���
		int sum=0;//���� ����� ������ ���� ����, �ʱ�ȭ

		for (int i = 1; i <= 100; i++) {
			sum = sum+i;
		}
		System.out.println("1���� 100���� ������ ��:\n"+sum);
	}
}