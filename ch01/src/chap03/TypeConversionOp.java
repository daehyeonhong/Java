package chap03;

public class TypeConversionOp {
	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5;
		
		System.out.println(intValue + doubleValue);//실수 + 실수
		System.out.println(intValue + (int)doubleValue);//정수 + 정수, 강제형변환(casting)
	}
}
