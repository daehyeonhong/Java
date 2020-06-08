package ch03;

public class BitOperator3 {
	public static void main(String[] args) {
		byte a, b, c;
		a = 14;
		b = 13;
		c = 12;
		byte result1 ,result2, result3;
		result1 = (byte)(a + b);
		result2 = (byte)(b + c);
		result3 = (byte)(c + a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(toBinaryString(a));
		System.out.println(toBinaryString(b));
		System.out.println(toBinaryString(c));
		
		System.out.println(toBinaryString(result1));
		System.out.println(toBinaryString(result2));
		System.out.println(toBinaryString(result3));
		
	}
	public static String toBinaryString(byte value) {
		String str = Integer.toBinaryString(value);
		while (str.length()<8) {
			str = "0"+str;
		}
		return str;
	}
}
