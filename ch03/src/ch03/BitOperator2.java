package ch03;

public class BitOperator2 {
	public static void main(String[] args) {
		byte c = 20;//0x14
		byte d = -8;//0xf8
		
		System.out.println(toBinaryString(c));//0001_0100
		System.out.println(toBinaryString(d));//1111_1000
		//��Ʈ ����Ʈ ����
		// >> �� �ֻ��� ��Ʈ�� ä����
		// >>>�� 0�� ä����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2);//c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c>>2);//c�� 2��Ʈ ������ ����Ʈ
		System.out.println(d>>2);//d�� 2��Ʈ ������ ����Ʈ
		System.out.printf("%x\n", (d>>>2));//d�� 2��Ʈ ������ ����Ʈ
	}
	public static String toBinaryString(byte b) {
		String str = Integer.toBinaryString(b);
		while (str.length()<8) {
			str = "0"+str;
		}
		return str;
	}
}
