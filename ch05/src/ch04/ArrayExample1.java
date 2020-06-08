package ch04;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] score = { 78, 98, 54, 76, 87 };
		// ÇÕ, Æò±Õ
		int sum = 0;
		for (int i = 0; i < score.length; i++)
			sum += score[i];
		// ÃÑÁ¡
		System.out.println("ÃÑÁ¡:" + sum);
		System.out.println("Æò±Õ:" + sum / score.length);
	}
}
