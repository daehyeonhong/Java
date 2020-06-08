package ch02;
//정확한 계산시 부동소수점 타입 사용하지않음
public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPieces = apple*10;
		int number = 7;
		int temp = totalPieces - number;
		double result = temp/10.0;
		
		//double result = apple - number*pieceUnit;//1-0.7 = 0.3
		
		System.out.println("사과 한개에서 0.7 조각을 빼면, ");
		System.out.println(result+"조각이 남는다");
	}
}
