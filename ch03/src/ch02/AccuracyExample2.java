package ch02;
//정확한 계산시 부동소수점 타입 사용하지않음
public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;//1-0.7 = 0.3
		
		System.out.println("사과 한개에서 0.7 조각을 빼면, ");
		System.out.println(result+"조각이 남는다");
	}
}
