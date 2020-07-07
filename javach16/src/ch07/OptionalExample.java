package ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.stream.Stream;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		/*
		 * Stream<Integer> stream = list.stream(); IntStream intStream =
		 * stream.mapToInt(value -> value); OptionalDouble double1 =
		 * intStream.average(); double result = double1.getAsDouble();
		 */

		/* No value present */
		/*
		 * double result = list.stream().mapToInt(value ->
		 * value).average().getAsDouble();
		 */

		/* 방법1-> */
		OptionalDouble optional = list.stream().mapToDouble(Integer::intValue).average();
		System.out.println(optional.isPresent() ? ("방법1_평균: " + optional.getAsDouble()) : "방법1_평균: 0.0");

		/* 방법2-> */
		/*
		 * Stream<Integer> stream2 = list.stream(); double avg; Stream<Integer> stream =
		 * list.stream(); optional = stream.mapToInt(Integer::intValue).average(); avg =
		 * optional.orElse(0.0); System.out.println("방법2_평균: " + avg);
		 */
		double avg;
		Stream<Integer> stream2 = list.stream();
		avg = stream2.mapToInt(Integer::intValue).average().orElse(0.0);
		/* 집계한 결과 OptionalDouble로 받고 orElse(Default) */
		/* 값이 없으면 설정한 default값 0.0 사용 */
		System.out.println("방법2_평균: " + avg);

		/* 방법3-> */
		/*
		 * Stream<Integer> stream3 = list.stream(); OptionalDouble optional3 =
		 * stream3.mapToInt(Integer::intValue).average(); optional3.ifPresent(value ->
		 * System.out.println("방법3_평균: " + value));
		 */
		/* 집계한 값이 있으면 출력 없으면 미출력 */

		Stream<Integer> stream3 = list.stream();
		stream3.mapToInt(Integer::intValue).average().ifPresent(value -> System.err.println("방법3_평균: " + value));
	}
}