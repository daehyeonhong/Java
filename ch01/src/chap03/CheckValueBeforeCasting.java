package chap03;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		System.out.println("�ּҰ�:" + Byte.MIN_VALUE);
		System.out.println("�ִ밪:" + Byte.MAX_VALUE);
		
		if((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) { // '||' or���� A || B -> A�� ���̰ų� B�� ���̸� ��
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���.");
		}else {
			byte b = (byte)i;// -128~127;, �ʱⰪ���� 128 �Է� �Ұ�
			System.out.println(b);
		}
		
		byte b = (byte)i;// -128~127;, �ʱⰪ���� 128 �Է� �Ұ�
		System.out.println(b);
		
	}
}
