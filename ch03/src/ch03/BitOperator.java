package ch03;

public class BitOperator {
	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		System.out.println(toBinaryString(a));
		System.out.println(toBinaryString(b));
		//��Ʈ������
		System.out.println(("[��Ʈ ���� ���]"));
		/*System.out.printf("%04x\n", (short)(a & b));
		System.out.printf("%04x\n", (short)(a | b));
		System.out.printf("%04x\n", (short)(a ^ b));
		System.out.printf("%04x\n", (short)(~a));*/
		
		System.out.println(toBinaryString((short)(a)));
		System.out.println(toBinaryString((short)(~a)));
		/*
		byte c = 20;
		byte d = -8;
		
		System.out.println(toBinaryString(c));
		System.out.println(toBinaryString(d));
		
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c <<2);
		System.out.println(c >>2);
		System.out.println(d >>2);
		System.out.printf("%x\n", (d>>>2));*/
	}
	public static String toBinaryString(short a) {
		String str=Integer.toBinaryString(a);
		while(str.length()<16) {
			str="0"+str;
		}
		return str;
	}
}
