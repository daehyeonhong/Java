package Test0427.Test002;

import java.util.Scanner;

public class Exercise002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height, weight, standardWeight;
		
		System.out.println("ǥ��ü�� ����\rŰ�� �Է����ּ���.");

		height = scanner.nextDouble();
		standardWeight = (height - 100) * 0.9;
		System.out.println("Ű " + height + "�� ǥ�� ü����: " + standardWeight + "Kg �Դϴ�.");
		
		System.out.println("ü���� �Է����ּ���.");
		weight = scanner.nextDouble();
		
		if (weight < standardWeight) {
			System.out.println("��ü�� �Դϴ�.");
		} else if (weight == standardWeight) {
			System.out.println("����ü�� �Դϴ�.");
		} else {
			System.out.println("��ü�� �Դϴ�.");
		}
		scanner.close();
	}
}