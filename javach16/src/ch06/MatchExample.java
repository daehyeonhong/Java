package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatchExample {
	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };
		IntStream intStream = Arrays.stream(intArr);
		boolean result = intStream.allMatch(value -> value % 2 == 0);

		System.out.println("모두 2의 배수인가? " + (result ? "참" : "거짓"));

		intStream = Arrays.stream(intArr);
		result = intStream.anyMatch(value -> value % 3 == 0);

		System.out.println("3의 배수가 하나라도 있는가? " + (result ? "참" : "거짓"));

		intStream = Arrays.stream(intArr);
		result = intStream.noneMatch(value -> value % 3 == 0);
		System.out.println("3의 배수가 하나도 없는가? " + (result ? "참" : "거짓"));
	}
}