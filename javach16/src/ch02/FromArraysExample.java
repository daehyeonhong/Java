package ch02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArraysExample {
	static int sum;

	public static void main(String[] args) {
		String[] strArray = { "홍길동", "일지매", "임꺽정" };

		// StringArray로부터 Stream 얻기 Arrays.stream(Array)
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(s -> System.out.println(s));

		int[] intArray = { 1, 2, 3, 4, 5 };
		// IntegerArray로부터 Stream 얻기 IntStream 변수 = Arrays.Stream(Array)
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(i -> System.out.print(i + ","));

		System.out.println();

		// 숫자 범위로부터 Stream 얻기
		// LambdaExpression(Local)선언 되었을 때, Method내에서 선언된 변수를 람다식에서 사용하는 경우 선언된
		// variable -> FINAL
		// Field_Variable
		IntStream stream = IntStream.rangeClosed(1, 100);// 1~100
		stream.forEach(v -> sum += v);
		System.out.println("총합: " + sum);
	}
}