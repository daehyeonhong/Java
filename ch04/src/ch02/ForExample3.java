package ch02;
//for(�ʱⰪ; ������; ����){���๮;}
public class ForExample3 {
	public static void main(String[] args) {
		int sum = 0;

		int i = 1;//�ʱ�ȭ
		for (;;) {
			if(!(i<=100)) break;
			sum = sum + i;
			i++;
		}
		System.out.println("1���� 100���� ������ ��:"+sum);
	}
}
