package ch01;

public class LiteralExam3 {
	public static void main(String[] args) {
		int a = 0x5;//0x�� �����ϴ� ���ͷ��� 16����(hexa)�� ����
		int b = 0xA;
		int c = 0xB3;//16*B + 3
		int d = 0xAC08;// A*16^3 + C*16^2 + 0*16^1 + 8
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);//��½ô� 10������ ��ȯ�Ǿ ���
		
	}
}
