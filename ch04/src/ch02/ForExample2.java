package ch02;
//for(�ʱⰪ; ������; ����){���๮;}
public class ForExample2 {
	public static void main(String[] args) {
		int sum = 0;

		int i = 1;
		for ( ; i <= 100;) {
			sum = sum + i;
			i++;
		}
		System.out.println("1���� 100���� ������ ��:"+sum);
	}
}
