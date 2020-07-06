package ch07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AggregateExample {
	public static void main(String[] args) {
		long count = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).count();
		System.out.println("2의 배수의 갯수: " + count);

		IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });

		IntStream intStream2 = intStream.filter(n -> n % 2 == 0);
		long sum = intStream2.sum();
		System.out.println("2의 배수 합: " + sum);

		intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		intStream2 = intStream.filter(n -> n % 2 == 0);
		double average = intStream2.average().getAsDouble();
		System.out.println("2의 배수 평균: " + average);

		intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		intStream2 = intStream.filter(n -> n % 2 == 0);
		int max = intStream2.max().getAsInt();

		System.out.println("최댓값: " + max);

		intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		intStream2 = intStream.filter(n -> n % 2 == 0);
		int min = intStream2.min().getAsInt();

		System.out.println("최솟값: " + min);

		intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
		intStream2 = intStream.filter(n -> n % 3 == 0);
		int first = intStream2.findFirst().getAsInt();

		System.out.println("첫번째 3의 배수: " + first);
	}
}