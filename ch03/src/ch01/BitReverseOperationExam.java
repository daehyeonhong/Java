package ch01;

public class BitReverseOperationExam {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println("(심진수: )" + v1);
		System.out.println(Integer.toBinaryString(v1).length());
		System.out.println(toBinaryString(v1));
		System.out.println("(십진수: )" + v2);
		System.out.println(Integer.toBinaryString(v2).length());
		System.out.println("(십진수: )" + v3);
		System.out.println(Integer.toBinaryString(v3));
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + "(십진수: )" + v4);
		System.out.println(toBinaryString(v5) + "(십진수: )" + v5);
		System.out.println(toBinaryString(v6) + "(십진수: )" + v6);
		
		String message = "hello";
		System.out.println(message.length());
		
		int v0 = -2147483648;
		System.out.println(toBinaryString(v0) + "십진수: " + v0);
	}
	//메소드
	//접근 지정자, 생성장소지정자, 리턴타입, 메소드명(매개변수타입, 매개변수명){실행문}
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			//System.out.println(str); //과정을 보고 싶다면
			str = "0" + str;
		}
		return str;//함수(메소드)에서 return문을 만나면 종료하고 호출한 곳으로 이동.
					//return 값; 이면 값을 리턴 함.
	}
}
