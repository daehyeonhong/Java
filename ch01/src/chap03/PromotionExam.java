package chap03;
//promotion(자동형변환): 범위가 좁은 타입 >>> 범위가 넓은 타입
public class PromotionExam {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;//byte -> int
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;//char -> int
		System.out.println("가의 유니코드="+intValue);//int -> String
		
		intValue = 500;
		long longValue = intValue;//int -> long
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;//int -> double
		System.out.println(doubleValue);
	}
}
