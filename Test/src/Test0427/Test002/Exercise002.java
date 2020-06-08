package Test0427.Test002;

import java.util.Scanner;

public class Exercise002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height, weight, standardWeight;
		
		System.out.println("표준체중 계산기\r키를 입력해주세요.");

		height = scanner.nextDouble();
		standardWeight = (height - 100) * 0.9;
		System.out.println("키 " + height + "의 표준 체중은: " + standardWeight + "Kg 입니다.");
		
		System.out.println("체중을 입력해주세요.");
		weight = scanner.nextDouble();
		
		if (weight < standardWeight) {
			System.out.println("저체중 입니다.");
		} else if (weight == standardWeight) {
			System.out.println("정상체중 입니다.");
		} else {
			System.out.println("과체중 입니다.");
		}
		scanner.close();
	}
}