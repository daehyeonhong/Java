package chap03;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		System.out.println(num1-num2);
		
		float num3 = num2;//int -> float: 부호(1비트) + 지수(8비트) + 가수(23비트)
		num2 = (int)num3;//강제형변환(casting)
		
		int result = num1 - num2;
		System.out.println(result);
		
		num2 = 123456780;
		double num4 = num2;//double: 부소(1비트) + 지수 (11비트) + 가수(52비트)
		num2 = (int) num4;
		
		result = num1 - num2;
		System.out.println(result);
		
		int a = 24;
		float b = a;
		System.out.println((a)+(b));
	}
}
