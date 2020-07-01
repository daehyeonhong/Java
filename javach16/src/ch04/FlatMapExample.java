package ch04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");

		Stream<String> stream1 = inputList1.stream();
		stream1 = stream1.flatMap(new Function<String, Stream<? extends String>>() {
			@Override
			public Stream<? extends String> apply(String t) {
				return Arrays.stream(t.split(" "));
			}
		});
		stream1.forEach(t -> System.out.println(t));

		System.out.println();

		stream1 = inputList1.stream();
		Stream<String> stream2 = inputList1.stream();
		stream2 = stream2.flatMap(t -> Arrays.stream(t.split(" ")));
		stream2.forEach(t -> System.out.println(t));

		System.out.println();

		/* 숫자형 문자열 스트림 */
		List<String> inputList2 = Arrays.asList("10,20,30,40,50,60");
		Stream<String> inStream = inputList2.stream();

		IntStream intStream = inStream.flatMapToInt(new Function<String, IntStream>() {
			@Override
			public IntStream apply(String t) {
				String[] strArr = t.split(",");// ["10"]["20"]["30"]["40"]["50"]["60"]
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < intArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			}
		});

		intStream.forEach(value -> System.out.println(value));
	}
}