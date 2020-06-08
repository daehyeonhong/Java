package ch03;

public class BitOperator2 {
	public static void main(String[] args) {
		byte c = 20;//0x14
		byte d = -8;//0xf8
		
		System.out.println(toBinaryString(c));//0001_0100
		System.out.println(toBinaryString(d));//1111_1000
		//비트 시프트 연산
		// >> 은 최상위 비트가 채워짐
		// >>>은 0이 채워짐
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);//c를 2비트 왼쪽 시프트
		System.out.println(c>>2);//c를 2비트 오른쪽 시프트
		System.out.println(d>>2);//d를 2비트 오른쪽 시프트
		System.out.printf("%x\n", (d>>>2));//d를 2비트 오른쪽 시프트
	}
	public static String toBinaryString(byte b) {
		String str = Integer.toBinaryString(b);
		while (str.length()<8) {
			str = "0"+str;
		}
		return str;
	}
}
