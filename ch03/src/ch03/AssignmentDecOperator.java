package ch03;
//���� ����:������ ������ ����� ���� ���� ������ �����ϴ� ����
public class AssignmentDecOperator {
	public static void main(String[] args) {
		
		int a = 3, b = 3, c = 3;
		//���Կ�����
		a+=3;//a=a+3
		System.out.println(a);
		b*=3;//b=b*3;
		System.out.println(b);
		c%=2;//c=c%2
		System.out.println(c);
		
		int d = 3;
		a=d++;//a=d,d+1
		System.out.print(a);
		System.out.println(d);
		a=++d;
		System.out.print(a);
		System.out.println(d);
		a=d--;
		System.out.print(a);
		System.out.println(d);
		a=--d;
		System.out.print(a);
		System.out.println(d);
		
		//�ݺ���
		//for�ݺ��� for(�ʱⰪ;���ᰪ;��/��){��ɹ�}
		for (int i = 1; i <= 5; i++) {
			if (i<=4) {
				System.out.print(i+",");
			} else {
				System.out.println(i+"!");
			}
		}
		//1���� 2�� ������ �� ���
		System.out.println("=============================");
		for (int i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		//10���� 2�� ������ �� ���
		System.out.println("=============================");
		for (int i = 10; i >=0; i-=2) {
			System.out.println(i);
		}
	}
}
