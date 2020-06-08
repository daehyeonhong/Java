package ch01;

public class BitReverseOperationExam {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println("(������: )" + v1);
		System.out.println(Integer.toBinaryString(v1).length());
		System.out.println(toBinaryString(v1));
		System.out.println("(������: )" + v2);
		System.out.println(Integer.toBinaryString(v2).length());
		System.out.println("(������: )" + v3);
		System.out.println(Integer.toBinaryString(v3));
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + "(������: )" + v4);
		System.out.println(toBinaryString(v5) + "(������: )" + v5);
		System.out.println(toBinaryString(v6) + "(������: )" + v6);
		
		String message = "hello";
		System.out.println(message.length());
		
		int v0 = -2147483648;
		System.out.println(toBinaryString(v0) + "������: " + v0);
	}
	//�޼ҵ�
	//���� ������, �������������, ����Ÿ��, �޼ҵ��(�Ű�����Ÿ��, �Ű�������){���๮}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			//System.out.println(str); //������ ���� �ʹٸ�
			str = "0" + str;
		}
		return str;//�Լ�(�޼ҵ�)���� return���� ������ �����ϰ� ȣ���� ������ �̵�.
					//return ��; �̸� ���� ���� ��.
	}
}
