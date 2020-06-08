package Test0427.Test002;

import java.util.Scanner;

public class Test002T {
	public static void main(String[] args) {
		double weight, stWeight, height;
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요.");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요.");
		weight = scanner.nextDouble();
		stWeight = (height - 100) * 0.9;
		if (weight < stWeight) {
			System.out.println("저체중입니다.");

		} else if (weight == stWeight) {
			System.out.println("표준입니다.");
		} else {
			System.out.println("과체중입니다.");
		}
		scanner.close();
	}
}