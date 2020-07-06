package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		System.out.println("[peek()를 마지막에 호출한 경우]");
		IntStream intStream = Arrays.stream(intArr);
		intStream = intStream.filter(value -> value % 2 == 0);
		/* peek는 중간 단계 작업 함수로 최종 단계 함수호출이 안되면 지연 됨 */
		intStream.peek(value -> System.out.println(value));

		System.out.println("[최종처리 Method를 마지막에 호출한 경우]");
		intStream = Arrays.stream(intArr);
		intStream = intStream.filter(value -> value % 2 == 0);
		intStream = intStream.peek(value -> System.out.println(value));
		/* 최종처리 작업함수 sum()이 호출되어서 peek함수도 처리 */
		int sum = intStream.sum();

		System.out.println("결과: " + sum);

		/* forEach()_Method는 최종처리 함수 */
		System.out.println("[forEach()를 마지막에 호출한 경우]");
		intStream = Arrays.stream(intArr);
		intStream = intStream.filter(value -> value % 2 == 0);
		intStream.forEach(value -> System.out.println(value));
	}
}