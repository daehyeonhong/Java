package ch02;

public class ForDiceExample1 {
	public static void main(String[] args) {
		int dice1;//1~6 ����
		int dice2;//1~6 ����

		for (;;) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.println("dice1="+dice1+",dice2="+dice2);
			if (dice1+dice2==10) break;//�ݺ� ���� ���������� ��ɹ�;
		}
		System.out.println("10�� �Ǵ� �ֻ��� ����:"+dice1+","+dice2);
	}
}
