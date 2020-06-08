package Test.DATE0428;

import java.util.Scanner;

/*2. 사용자로부터 키를 입력받아서  표준체중을 계산한 후 사용자의
   체중과 비교하여 저체중인지, 표준인지, 과체중인지 출력하시요.
  표준체중=(키 -100 ) *0.9*/
public class StandardWeightExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weight, height, standardWeight;
		
		System.out.println("키를 입력하세요.");
		height = scanner.nextDouble();
		
		standardWeight = (double) (height - 100) * 0.9;

		System.out.println("체중을 입력하세요.");
		weight = scanner.nextDouble();
		
		System.out.println(standardWeight > weight ? "저체중" : standardWeight < weight ? "과체중" : "정상체중");
		System.out.println("표준체중:"+standardWeight);
		
		scanner.close();
	}
}