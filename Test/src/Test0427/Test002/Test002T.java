package Test0427.Test002;

import java.util.Scanner;

public class Test002T {
	public static void main(String[] args) {
		double weight, stWeight, height;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���.");
		height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���.");
		weight = scanner.nextDouble();
		stWeight = (height - 100) * 0.9;
		if (weight < stWeight) {
			System.out.println("��ü���Դϴ�.");

		} else if (weight == stWeight) {
			System.out.println("ǥ���Դϴ�.");
		} else {
			System.out.println("��ü���Դϴ�.");
		}
		scanner.close();
	}
}